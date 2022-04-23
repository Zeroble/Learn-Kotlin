package chap06.section1.customproperty

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null //? 붙여서 null값 할당 가능하도록 함
    var name: String = _name
        get() {
            // 프로퍼티를 임시로 선언해 사용 -> 보조 프로퍼티라고 함
            if (tempName == null)
                tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    val user1 = User(1, "Killdong", 35)
    user1.name = ""
    println("user3.name = ${user1.name}")
}