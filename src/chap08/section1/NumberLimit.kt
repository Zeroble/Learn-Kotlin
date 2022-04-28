package chap08.section1

import chap08.section1.HandlerA as HandlerA

// 매개 변수 형식 제한
class Calc<T : Number> {
    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

// 다수 조건의 형식 매개변수 제한
interface InterfaceA
interface InterfaceB

class HandlerA : InterfaceA, InterfaceB
class HandlerB : InterfaceB

class ClassA<T> where T : InterfaceA, T : InterfaceB //두개의 인터페이스를 구현하는 클레스만 가능

fun <T> myMax(a: T, b: T): T where T : Number, T : Comparable<T> {
    return if (a > b) a else b
}

fun main() {
    val calc = Calc<Int>()
    println(calc.plus(10, 20))

    val calc2 = Calc<Double>()
    val calc3 = Calc<Long>()
    // val calc4 = Calc<String>() //에러 -> 제한된 자료형

    println(calc2.plus(2.0, 3.0))
    println(calc3.plus(123, 234))
//    println(calc3.plus("asdf","qwer")) //에러 발생


    val obj1 = ClassA<HandlerA>()
    // val obj2 = ClassA<HandlerB>() // 에러 -> 두개 모두 구현되지 않음.

    println(myMax<Int>(1, 2))
}