package chap03.section6

fun a() = b()
fun b() = println("B!")
fun c() {
    //    fun d() = e() => ERROR //최상위 함수가 아닌 함수는 선언 후에 사용.
    fun e() = println("e!")
    fun d() = e()
}

fun main() {
    a()
    b()
    c()
//    Local functions => Error
//    e()
//    d()
}