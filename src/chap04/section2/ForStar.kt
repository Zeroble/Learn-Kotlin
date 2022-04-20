package chap04.section2

fun main() {
    val n = readLine()!!.toInt()
    println(n)
    for (i in 0 until n) {
        for (j in 1 until n - i)
            print(" ")
        for (j in 1..i * 2 + 1)
            print("*")
        println()
    }
}