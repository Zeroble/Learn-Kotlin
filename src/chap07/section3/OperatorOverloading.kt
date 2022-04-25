package chap07.section3

class Manager {
    // 호출 연산자
    operator fun invoke(value: String) {
        println(value)
    }
}

class Point(var x: Int = 0, var y: Int = 10) {
    // 연산자 오버라이딩
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }
    operator fun dec() = Point(--x, --y)
}

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var point = Point()
    point = p1 + p2 // 객체끼리 + 연산이 가능해짐!
    println("Point = (${point.x}, ${point.y})")

    --point
    println("point = (${point.x}, ${point.y})")

    operator fun Point.unaryMinus() = Point(-x, -y) // 클래스 밖에서 정의
    println(-point)

    val manager = Manager()
    // manager.invoke() 의 형태로 실행되며 .invoke() 가 생략됨.
    manager("Do something for me!")

    // 람다식에는 기본적으로 invoke 가 정의된다.
    val sum = { x: Int, y: Int -> x + y }
    sum.invoke(3, 10)
    sum(3, 10)
}