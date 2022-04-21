package chap05.section2.init

class Bird(var name: String, var wing: Int, var beak: String,var color:String){
    //프로퍼티는 매개변수 안에 var를 사용해 프로퍼티로서 선언되어 본문에서 생략

    init {
        println("초기화 블록 시작")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("초기화 블록 끝")
    }
    fun fly() = println("fly wing: $wing")
    fun sing(vol: Int) = println("sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yello"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}
