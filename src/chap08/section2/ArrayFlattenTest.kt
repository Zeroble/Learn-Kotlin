package chap08.section2

fun main() {
    val numbers = arrayOf(1,2,3)
    val stars = arrayOf("One", "Two", "Three")
    val simpleArray  = arrayOf(numbers, stars)
    println(simpleArray.contentToString())

    val flattenSimpleArray = simpleArray.flatten()
    println(flattenSimpleArray)
}