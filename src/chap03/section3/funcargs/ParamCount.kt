package chap03.section3.funcargs

fun main() {
    noParam({ "Hello World!" })
    noParam { "Hello World!" } //소괄호 생략 가능

    oneParam({ a -> "Hello Wrold! $a" })
    oneParam { a -> "Hello Wrold! $a" }
    oneParam { "Hello Wrold! $it" } //매개변수가 하나인 경우 it 으로 대체 가능

    moreParam { a, b -> "Hello World $a $b" }
    moreParam { _, b -> "Hello World $b" }

    withArgs("Arg1", "Arg2", { a, b -> "Hello Wrold! $a $b" })
    withArgs("Arg1", "Arg2") { a, b -> "Hello Wrold! $a $b" }
}

fun noParam(out: () -> String) = println(out())
fun oneParam(out: (String) -> String) {
    println(out("One Param"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}