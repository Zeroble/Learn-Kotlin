package chap06.section2

import kotlin.properties.Delegates

//왜 커스텀 세터 게터 사용 불가능 메인에서는?
class Test {
    private var tmp: Int = 0
    var test: Int = 0
        set(value) {
            if (value > field) tmp = value
            return tmp
        }
}

fun main() {
    // 조건에 맞지 않으면 값 할당을 못하도록 함.
//    var max: Int by Delegates.vetoable(0) { prop, old, new ->
//        new > old
//    }
//
//    println(max)
//    max = 10
//    println(max)
//
//    max = 5
//    println(max)

    var test = Test()
    test.test = 10
    println(test.test)

    test.test = 5
    println(test.test)
}