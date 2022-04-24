package chap06.section3

class C {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }

    // Private function -> 반환 자료형은 익명 객체 자료형이 됨
    private fun foo() = object {
        val x = "x"
    }

    // public function -> 반환 자료형은 any 형이 됨
    fun publicFoo() = object {
        val x = "x"
    }

    fun bar() {
        val x1 = foo().x
        // val x2 = publicFoo().x //에러 발생!
    }
}

fun main() {
    var c = C()
    println(c.publicFoo() is Any)
    println(c.adHoc is Any)
}