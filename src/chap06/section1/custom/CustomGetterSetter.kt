package chap06.section1.custom

class User(_id: Int, _name: String, _age: Int) {
    // value : 세터의 매개변수
    // field : 프로퍼티를 참조하는 변수
    val id: Int = _id
    var name: String = _name
        get() = field
        set(value) {
            println("It is custom setter")
            field = value.uppercase()
        }

    var age: Int = _age
        private set //외부에서 값 할당 금지

    override fun toString(): String {
        return "User(id=$id, name='$name', age=$age)"
    }

}

fun main() {
    val user1 = User(1, "Killdong", 30)
//    user1.age = 35 //private
    user1.name = "asdf"
    println(user1.toString())
}