package chap08.section2

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.0),
        Product("Smart Phone", 999.0),
        Product("Drone", 240.0),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99),
    )

    products.sortBy { it.price }
    products.forEach { println(it) }

    println("-----------------------------------")

    products.sortBy { elem -> -elem.name.length }
    products.forEach { elem -> println(elem) }
}