package chap07.coffeeMaker

class CoffeeMaker(val coffeeModule: CoffeeModule) {
    fun brew() {
        val theSiphon: Thermosiphon = coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, here!! Enjoy it!!")
        theSiphon.off()
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}