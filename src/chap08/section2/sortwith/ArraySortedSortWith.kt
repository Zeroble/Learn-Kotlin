package chap08.section2.sortwith

data class Product(val name:String, val price :Double)

// Comparator를 이용한 비교
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

    products.sortWith(
        Comparator<Product>{p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                p1.price < p2.price -> -1
                else -> -99
            }
        }
    )
    products.forEach { println(it) }
}
