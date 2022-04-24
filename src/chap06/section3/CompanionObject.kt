package chap06.section3

class Person {
    var id: Int = 0
    var name: String = "Youngeok"

    companion object {
        var language: String = "Korean"
        fun work() {
            println("Working...")
        }
    }
}

fun main() {
    println(Person.language)
    Person.language = "English"
    println(Person.language)
    Person.work()
//    println(Person.name) //컴페니언 객체가 아니므로 오류
}