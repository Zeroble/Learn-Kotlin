package chap06.section3

open class Superman() {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people.")
    open fun fly() = println("Flying in the air")
}

fun main() {
    //object 를 사용하면 하위 클레스를 만들지 않고 익명 클레스를 만들어 메소드를 오버라이딩 할 수 있다.
    val pretendedMan = object : Superman() {
        override fun fly() {
            println("I am not a real superman. I can not fly")
        }
    }

    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()


    // 익명 클레스 사용
    // local이나 private 정의 영역에서만 사용 가능
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }

    println(adHoc.x + adHoc.y)
}