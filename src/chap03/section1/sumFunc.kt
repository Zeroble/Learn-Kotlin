package chap03.section1

fun sum1(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun sum2(a: Int, b: Int): Int = a + b

fun sum3(a: Int, b: Int) = a + b

fun main() {
    println(sum1(1, 3))
    println(sum2(1, 3))
    println(sum3(1, 3))
}
