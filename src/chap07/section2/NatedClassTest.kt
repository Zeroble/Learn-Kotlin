package chap07.section2

// 중첩클래스 예제
// 정적 클래스처럼 다뤄짐 (객체 생성 없이 접근 가능)

class Outer {
    val ov = 5

    companion object {
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }

    class Nested {
        val nv = 10
        fun greeting() = "[Nasted] Hello ! $nv" //외부의 ov 에는 접근이 불가능하다!

        fun accessOuter(){
            //상위 클래스에 접근하고싶다면 컴패니언 객체를 이용하면 된다!
            println(country)
            getSomething()
        }
    }

    fun outside() {
        val msg = Nested().greeting()
        println("[Outer] : $msg, ${Nested().nv}")

        var test = Nested()
        test.accessOuter()
    }
}

fun main() {
    val output = Outer.Nested().greeting()
    println(output)

    //Outer.outside() // 외부 클래스의 경우는 객체를 생성해야함
    val outer = Outer()
    outer.outside()
}