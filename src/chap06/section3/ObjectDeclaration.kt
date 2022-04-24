package chap06.section3

object OCustomer {
    //object 키워드 이용 방식
    //객체 접근 시점에 초기화 하므로 생성자 사용 불가능
    //초기화를 위해 init 을 사용 가능하다.
    //클레스나 인터페이스 상속은 가능.

    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init!!")
    }
}

class CCustomer{
    //컴패니언 객체 이용한 방식
    companion object{
        const val HELLO = "hello"
        var name = "Joosol"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello World")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting() //객체 접근 시점
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}