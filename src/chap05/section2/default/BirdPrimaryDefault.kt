package chap05.section2.default

class Bird(var name: String = "NoName", var wing: Int = 3, var beak: String, var color: String) {
    //프로퍼티는 매개변수 안에 var를 사용해 프로퍼티로서 선언되어 본문에서 생략

    fun fly() = println("fly wing: $wing")
    fun sing(vol: Int) = println("sing vol: $vol")

    override fun toString(): String {
        return super.toString()
    }
}

fun main() {
    val coco = Bird(beak = "little", color = "red")
    println("coco.name : ${coco.name}")
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
    println(coco.toString())
}

