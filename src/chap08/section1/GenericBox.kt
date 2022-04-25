package chap08.section1

// 제네릭 사용하기

class Box<T>(t: T) {
    var name = t
}

class MyClass1<T>(var myProp: T) {}
class MyClass2<T> {
    val myProp: T

    constructor(myProp: T) {
        this.myProp = myProp
    }
}

fun main() {
    val box1: Box<Int> = Box(1)
    val box2: Box<String> = Box("Hello")
    println(box1.name)
    println(box2.name)
}