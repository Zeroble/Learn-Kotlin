package chap04.section2

import chap03.section3.funcargs.lambda

fun main() {
    retFunc1()
    retFunc2()
    retFunc3()

    //람다에서 반환
    val getMessage1 = lambda@{ num: Int ->
        if (num !in 1..100) {
            //return "Error" => 지역적 반환(X)
            return@lambda "Error" //라벨을 통한 반환
        }
        "Success"
    }

    //익명함수에서 반환
    val getMessage2 = fun(num: Int): String {
        if (num !in 1..100) {
            //return "Error" => 지역적 반환(X)
            return "Error" //라벨을 통한 반환
        }
        return "Success"
    }
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc1() {
    //람다 함수에서 라벨 사용
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b ->
        val result = a + b
        if (result > 10) return@lit
        println("result : $result")
    }
    println("end of retFunc")
}

fun retFunc2() {
    //암묵적 라벨 사용
    println("start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if (result > 10) return@inlineLambda
        println("result : $result")
    }
    println("end of retFunc")
}

fun retFunc3() {
    //익명함수를 사용한 반환
    println("start of retFunc")
    inlineLambda(13, 3, fun(a, b) {
        val result = a + b
        if (result > 10) return
        println("result : $result")
    })
    println("end of retFunc")
}