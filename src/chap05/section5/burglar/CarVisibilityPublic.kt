package chap05.section5.burglar

import com.sun.org.apache.xpath.internal.operations.Bool

open class Car protected constructor(year: Int, model: String, power: String, wheel: String) {
    private var year: Int = year;
    public var model: String = model
    protected open var power: String = power
    internal var wheel: String = wheel

    protected fun start(key: Boolean) {
        if (key) println("Start the Engine!")
    }

    class Driver(name: String, license: String) {
        private var name: String = name
        var license: String = license
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}

class Tico(year: Int, model: String, power: String, wheel: String, var name: String, private var key: Boolean) :
    Car(year, model, power, wheel) {
    override var power: String = "50hp"
    val driver = Driver(name, "First class")

    constructor (name: String, key: Boolean) : this(2014, "basic", "100hp", "normal", name, key) {

    }

    fun access(password: String) {
        if (password == "gotico") {
            println("tico asccess()")
            //super.year => 접근 불가
            println("super.model = ${super.model}") //public
            println("super.model = ${super.power}") //protected
            println("super.model = ${super.wheel}") //internal
            println("name = ${name}") //internal
            super.start(key)

            // driver.name //접근 불가
            println("Driver().license - ${driver.license}")
            driver.driving()
        } else {
            println("You're a burglar")
        }
    }
}

class Burglar() {
    fun steal(anycar: Any) {
        if (anycar is Tico) {
            println("Burglar steal()")
//            anycar.power // protected
//            anycar.year  //private
            println("anycar.name = ${anycar.name}") //public
            println("anycar.wheel = ${anycar.wheel}") // internal
            println("anycar.model = ${anycar.model}") // public

            println(anycar.driver.license) //public
            anycar.driver.driving() // internal
//            println(Car.start()) //protected
            anycar.access("dontknow")
        }else{
            println("Nothing to steal")
        }
    }
}

fun main() {
    //val car = Car() // protected로 생성 불가능
    val tico = Tico("kildong", true)
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}