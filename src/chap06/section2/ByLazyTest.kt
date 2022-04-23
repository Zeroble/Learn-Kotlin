package chap06.section2

class LazyTest{
    init {
        println("Init block")
    }

    val subject by lazy {
        println("lazy initalized")
        "Kotlin Programming"
    }
    fun flow ()
    {
        println("not initalized")
        println("subject one : $subject")
        println("subject two : $subject")
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}