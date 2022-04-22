package chap05.section3.override

//  open 키워드를 사용하여 상속 가능한 클레스로 만듦
//  미 사용시 -> 상속 불가능 객체 (최종 객체)
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    //프로퍼티는 매개변수 안에 var를 사용해 프로퍼티로서 선언되어 본문에서 생략

    fun fly() = println("fly wing: $wing") //최종 메소드로 오버라이딩이 불가능함
    open fun sing(vol: Int) = println("sing vol: $vol") // open 메소드로 오버라이딩 가능
    override fun toString(): String {
        return "Bird(name='$name', wing=$wing, beak='$beak', color='$color')"
    }
}

class Lark(name: String, wing: Int, beak: String, color: String, var newVar: String) : Bird(name, wing, beak, color) {
    //  주 생성자를 사용하는 상속
    fun singHightone() = println("Happy song!")
    final override fun sing(vol: Int) { //final 키워드를 사용하면 하위 클레스에서 재정의가 불가능하게 됨
        println("vol is $vol")
    }
}

open class Parrot : Bird {
    //  부 생성자를 사용하는 상속
    val language: String

    constructor(name: String, wing: Int, beak: String, color: String, language: String)
            : super(name, wing, beak, color) {
        this.language = language
    }


    fun speak() = println("I can spake $language")
    override fun toString(): String {
        return super.toString() + " Parrot(language='$language')"
    }
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown", "newVar")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")

    println(coco.toString())
    println(lark.toString())
    println(parrot.toString())

    lark.singHightone()
    parrot.speak()
    lark.fly()
}


