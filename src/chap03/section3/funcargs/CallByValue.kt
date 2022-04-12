package chap03.section3.funcargs

fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("call By Value funtion")
    return b
}

val lambda: () -> Boolean = {
    println("lambda funtion")
    true
}