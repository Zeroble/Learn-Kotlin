package chap06.section1

fun main() {
    val kim = FakeAge()
    kim.age = 15
    println(kim.age)

    println(FakeAge(35).age)
}

class FakeAge() {
    constructor(age: Int) : this() {
        this.age = age
    }

    var age: Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}
