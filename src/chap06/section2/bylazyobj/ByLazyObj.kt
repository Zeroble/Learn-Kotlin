package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person by lazy { //lazy 사용 객체 지연 초기화
        isPersonInstantiated = true
        Person("kim", 23)
    }
    val personDelegate = lazy { Person("Hong", 40) } //위임 변수 사용 초기화 (객체를 위임)

    val subject = lazy {
        println("lazy initalized")
        "Kotlin Programming"
    }
    println(subject.value)

    println("Person Init : $isPersonInstantiated")
    println("personDelegate init : ${personDelegate.isInitialized()}")

    println(person.name)
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("Person Init : $isPersonInstantiated")
    println("personDelegate init : ${personDelegate.isInitialized()}")
}
