package chap06.section1

class Person(val name :String, var age :Int)
{

}

fun main() {
    var p1 = Person("Killdong", 30)
    println("${p1.name} and ${p1.age}")
    // p1.name = "!!!" => val -> 불변 -> 에러 발생
}