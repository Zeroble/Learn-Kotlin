package chap08.section2

fun main() {
    val arr = arrayOf(1, -2, 3, -4, 5, -6)
    arr.filter { e -> e > 0 }
        .forEach { e -> print("$e ") }

    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    println()
    fruits.filter { it.startsWith("a") } // A로 시작하는 단어만 필터링
        .sortedBy { it } // 사전식으로 정렬
        .map { it.uppercase() } // 대문자로 만듦
        .forEach { println(it) } // 출력


}