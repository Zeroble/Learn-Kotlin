package chap05.section2.secondary

class Bird {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    constructor(name: String, beak: String) {
        this.name = name
        this.beak = beak
        wing = 2
        color = "gray"
    }


    fun fly() = println("fly wing: $wing")
    fun sing(vol: Int) = println("sing vol: $vol")

    override fun toString(): String {
        return "Bird(name='$name', wing=$wing, beak='$beak', color='$color')"
    }

}

fun main() {
    val coco = Bird("myBird", 3, "strong", "rainbow")
    coco.color = "blue"

    println(coco.color)
    println(coco.toString())
    coco.fly()
    coco.sing(3)

    val cucu = Bird("yourBird", "longlong", )
    println(cucu.toString())
    cucu.fly()
    cucu.sing(3)
}
