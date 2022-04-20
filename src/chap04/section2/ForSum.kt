package chap04.section2

fun main() {
    for (x in 1..5)
        println(x)

    var sum: Int = 0
    for (x in 1..10){
        sum += x
    }
    println(sum)

    for (x in 5 downTo 1 step 2)
        println(x)
}