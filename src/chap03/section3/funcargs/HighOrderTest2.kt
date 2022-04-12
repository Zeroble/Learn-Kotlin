package chap03.section3.funcargs

fun main() {
    var result: Int = highOrder({ x, y -> x + y }, 10, 20)
    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}