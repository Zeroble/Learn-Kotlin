package chap03.section5

fun main() {
    //인라인 함수 shourtFunc 의 내용이 복사되어 shortFuc으로 들어감.

    var c:Int
    shourtFunc(3){ println("First call : $it")}
    shourtFunc(5){ println("Second call : $it")}
}

inline fun shourtFunc(a:Int, out:(Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}