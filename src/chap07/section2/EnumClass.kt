package chap07.section2

//-------------------------------------------------------------
// 열거형 활용
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

// 각 상수는 클래스의 객체로 취급된다.
// 주 생성자를 이용해 값을 초기화할 수 있다.
enum class DayOfWeek(val num: Int) {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7)
}

fun isWeekend(day: DayOfWeek): Boolean? =
    when (day.num) {
        1, 2, 3, 4, 5 -> true
        6, 7 -> false
        else -> null
    }
//    when (day) {
//        DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY -> true
//        DayOfWeek.SATURDAY, DayOfWeek.SUNDAY -> false
//    }

// 필요한 경우, 세미콜론(;)을 이용해 상수 정의를 종료하고 메서드를 포함 가능하다.

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(2555, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun printBlueColor() {
    println(Color.BLUE.rgb())
}

fun getColor(color: Color) = when (color) {
    Color.RED -> color.name
    Color.ORANGE -> color.ordinal //순서 번호
    Color.YELLOW -> color.toString() // 문자열 변환
    Color.GREEN -> color
    Color.BLUE -> color.r
    Color.INDIGO -> color.g
    Color.VIOLET -> color.rgb()
}

//-------------------------------------------------------------
//인터페이스를 통한 열겨형 구현
interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String) : Score {
    NORMAL("Thrid") {
        override fun getScore(): Int {
            return 100
        }
    },
    SILVER("Second") {
        override fun getScore(): Int = 500
    },
    GOLD("First") {
        override fun getScore(): Int = 1500
    }
}

fun interfaceEnum() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for (grade in MemberType.values()) println("grade.name = ${grade.name}, prio = ${grade.prio}")
}
//-------------------------------------------------------------

fun main() {
    printBlueColor()
    println(getColor(Color.BLUE))
    interfaceEnum()
}