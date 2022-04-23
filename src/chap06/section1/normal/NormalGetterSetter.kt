package chap06.section1.normal

class User(_id: Int, _name: String, _age: Int) {
    // value : 세터의 매개변수
    // field : 프로퍼티를 참조하는 변수
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user1 = User(1, "Killdong", 30)
    user1.age = 35
    println("user1.age = ${user1.age}")
}