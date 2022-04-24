package chap07.section1

abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    // 추상 프로퍼티 : 하위 클레스에서 재정의 강제함
    abstract var maxSpeed: Double

    var year = "2018"

    abstract fun start()
    abstract fun stop()
    override fun toString(): String {
        return "Vehicle(name='$name', color='$color', weight=$weight, maxSpeed=$maxSpeed, year='$year')"
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("Car Started!")
    }

    override fun stop() {
        println("Car Stopped!")
    }
}

class Motercycle(name: String, color: String, weight: Double, override var maxSpeed: Double) :
    Vehicle(name, color, weight) {
    override fun start() {
        println("Bike started!!")
    }

    override fun stop() {
        println("Bike stopeD!!")
    }
}

fun main() {
    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val moter = Motercycle("DreamBike", "red", 173.0, 100.0)

    car.year = "2013"

    println(car.toString())
    car.start()
    println(moter.toString())
    moter.start()
}