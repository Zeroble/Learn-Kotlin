package chap08.section1.limit

open class Animal(val size: Int) {
    fun feed() = println("Feeding")
}

class Cat(val jump: Int) : Animal(50)
class Spider(val position: Boolean) : Animal(1)

// 형식 매개변수를 Animal로 제한한다.
class Box<out T : Animal>(val element: T) {         // 주 생성자에서는 val만 허용
    fun getAnimal(): T = element                    // out은 반환 자료형에만 사용 가능.
//    fun set(new :T){                              // T는 in위치에 사용 불가
//        element = new
//    }
}

fun main() {
    // 일반적인 객체 생성의 경우
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1                              // 상위 자료형으로 변경 -> 문제없음!
    a1 = s1                                          // a는 spider의 객체가 된다.
    println("a1.size == ${a1.size}")

    val c2: Box<Animal> = Box<Cat>(Cat(10))     // 공변성 -> Cat 은 Animal의 하위 클래스
    println("c2.element.size == ${c2.element.size}")

//    val c3: Box<Cat> = Box<Animal>(10               // 반대의 경우는 인스턴스화 되지 않는다.
//    val c4: Box<Any> = Box<Int>(10)                 // 자료형을 제한하여 animal 과 하위 클래스 이외에는 사용 불가능.
}