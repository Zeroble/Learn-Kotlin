package chap07.section2

interface Switcher {
    fun on(): String
}

class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        // inner class : 이용하면 바깥 클래스의 프로퍼티에 접근이 가능하다!
        fun getInfo() = "${model} : Installed on $cpu with ${size}GB"
    }

    fun powerOn(): String {
        // 지역 클래스 선언 : powerOn 메소드 안에서만 유효하다.
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }

        val powerStatus = Led("Red")
        val powerSwtich = object : Switcher {
            //익명 객체를 사용해 Switcher의 on()메소드 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        }
//        return powerStatus.blink()
        return powerSwtich.on()
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myPhone = Smartphone("Note9")
    println(myPhone.powerOn())
}