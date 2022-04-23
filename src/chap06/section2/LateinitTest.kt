package chap06.section2

class Person{
    lateinit var name :String

    fun test(){
        if (!::name.isInitialized)
            println("Not initalized")
        else
            println("Initalized")
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "kildong"
    kildong.test()
    println("name = ${kildong.name}")
}