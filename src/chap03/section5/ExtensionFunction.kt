package chap03.section5

fun main() {
    val source = "Hello Wrold!"
    val target = "Kotlin"
    val target2 = "Kotlinasdfasdfawqer"
    println(source.getLongString(target))
    println(source.getLongString(target2))
}

fun String.getLongString(target: String): String = if (this.length > target.length) this else target