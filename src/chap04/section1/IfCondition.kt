package chap04.section1

//조건문의 표현식 사용
//삼향 연산자랑 비슷한데, 길게 쓸 수 있는 방법.

fun main() {
    val a = 12
    val b = 7

    val max = if (a > b) {
        println("a가 큼")
        a
    } else {
        println("b가 큼")
        b
    }
    println(max)
}