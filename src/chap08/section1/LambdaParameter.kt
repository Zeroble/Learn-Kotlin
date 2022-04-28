package chap08.section1

fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}

typealias arithemtic<T> = (T, T) -> T

fun <T> addAux(a: T, b: T, op: arithemtic<T>): T {
    return op(a, b)
}

fun main() {
    val sum1: (Int, Int) -> Int = { a, b -> a + b }
    val sum2 = { a: Int, b: Int -> a + b }

    println(add(2, 3) { a, b -> a + b })
    println(add(2, 3, sum1))
    println(add(2, 3, sum2))
}