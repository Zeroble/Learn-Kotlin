package chap05.section1.define

class Bird{
    var anem: String = "mybird"
    var wing : Int =2
    var beak: String = "short"
    var color: String = "blue"

    fun fly() =println("fly wing: $wing")
    fun sing(vol: Int) = println("sing vol: $vol")
}

fun main() {
    val coco = Bird()
    coco.color = "blue"

    println(coco.color)
    coco.fly()
    coco.sing(3)
}
