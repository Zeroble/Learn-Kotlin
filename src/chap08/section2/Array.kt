package chap08.section2

fun main() {
    // 배열 만들기
    val numbers = arrayOf(1, 2, 3, 4)
    val animals = arrayOf("Dog", "Cat", "Tuttle")

    // 2차원 자료형
    val arr2d = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))

    for (i in arr2d) {
        for (j in i)
            println(j)
    }

    // 자료형 혼합 배열
    val mixArr = arrayOf(1, 2, "3", 4.0)

    // 자료형 형태 제한하기
    // 자료형 이름+ArrayOf
    val limitArr1 = intArrayOf(1, 2, 3)
    // arrayOf<자료형 이름>
    val limitArr2 = arrayOf<Int>(1, 2, 3)

    // 자료형 접근
    println(limitArr1[1])
    println(limitArr1.get(1))

    //indices = 최소 - 최대 크기를 반환함
    for (i in mixArr.indices)
        println("mixArr[$i] = ${mixArr[i]}")

    for (i in mixArr.indices)
        println("mixArr[$i] = ${mixArr[i]}")

    println(mixArr.contentToString())
    println(arr2d.contentDeepToString())
}