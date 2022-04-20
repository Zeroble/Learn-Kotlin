package chap04.section2

fun main() {
    fun greet1() = { println("Hello")}
    fun greet2() = fun(){ println("Hello")}

    println("Test 1")
    greet1()
    greet2()

    println("Test 2")
    greet1()()
    greet2()()
}