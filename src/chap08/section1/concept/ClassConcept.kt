package chap08.section1.concept

// 1. 무변성(각 인스턴스 자료형이 관계가 없음) 선언
// class Box<T>(val size: Int)

// 2. 공변성 (각 자료형의 상화관계가 인스턴스 자료형에도 적용됨.)
// class Box<out T>(val size: Int)

// 3. 반공변성 (각 자료형의 상화관계가 인스턴스 자료형에 반대로 적용됨.)
 class Box<in T>(val size: Int)


// 각 클래스의 관계
//   Any
//    ↑
//   Int
//    ↑
// Nothing

fun main() {
    // 1
//    val anys: Box<Any> = Box<Int>(10)             // 에러 -> 타입이 맞지 않는다.
//    val nothing: Box<Nothing> = Box<Int>(20)      // 에러 -> 타입이 맞지 않는다.


    // 2
    //val anys :Box<Any> = Box<Int> (10)
    // val nothing : Box<Nothing> = Box<Int>(20)    // 에러 -> 타입이 맞지 않는다.

    // 3
    // val anys :Box<Any> = Box<Int >(10)
    val nothings :Box<Nothing> = Box<Int>(20)
}