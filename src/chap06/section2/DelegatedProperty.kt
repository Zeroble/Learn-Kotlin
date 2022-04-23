package chap06.section2

import kotlin.properties.Delegates

class User {
    // 값이 바뀔 때마다 람다 함수 호출.
    var name: String by Delegates.observable("NONAME") { prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user = User()
    println(user.name)
    user.name = "Kildong"
    user.name = "Dooly"
}