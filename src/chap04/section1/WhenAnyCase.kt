package chap04.section1

fun main() {
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(MyClass())
}

class MyClass {

}

fun cases(obj: Any) {
    when (obj){
        //해당하는 모든 case가 실행된다.
        1 -> println("Int : $obj")
        "Hello" -> println("String : $obj")
        is Long -> println("Long : $obj")
        !is Long -> println("Not a String")
        else -> println("Unknown")
    }
}
