package chap03.section3.funcargs

fun main() {
    val res1 = sum(3, 2)
    val res2 = mul(sum(3, 3), 3)

    println("res1: $res1, res2 : $res2")
    println("funcFunc : ${funcFunc()}")

    val multi = {x:Int , y:Int -> x*y}
    var result = multi(10, 20)
    println(result)
}

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b

fun funcFunc():Int {
    return sum(2,2)
}