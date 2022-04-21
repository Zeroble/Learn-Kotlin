package chap04.section3

fun main() {
    println("label Break1")
    for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) break
            println("i:$i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
    println()

    println("label Break2")
    for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@second
            println("i:$i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
    println()

    println("label Break3")
    first@for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}