package chap06.section1

open class First {
    open val x: Int = 0 //오버라이딩 가능
        get() {
            println("First x")
            return field
        }
    val y: Int = 0 //최종 프로퍼티
}

class Second : First() {
    override val x: Int = 0 //상위 클레스와 구현부가 다르게 오버라이딩 됨
        get() {
            println("Second x")
            return field + 3
        }
    //override val y : Int = 0 // 오버라이딩 불가능
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}