package chap08.section2

fun main() {
    // 배열 만들기
    val numbers = arrayOf(1, 2, 3, 4)
    val animals = arrayOf("Dog", "Cat", "Tuttle")

    // 2차원 자료형
    val arr2d = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))

    for (i in arr2d) {
        for (j in i) println(j)
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
    for (i in mixArr.indices) println("mixArr[$i] = ${mixArr[i]}")

    for (i in mixArr.indices) println("mixArr[$i] = ${mixArr[i]}")

    println(mixArr.contentToString())
    println(arr2d.contentDeepToString())

    // 표현식으로 배열 만들기
    val arr3 = Array(5) { i -> i * 2 }
    println(arr3.contentToString())

    // null값으로 초기화 된 배열
    var nullArray = arrayOfNulls<Int>(1000)

    // 0으로 초기화 된 배열
    var zeroArray = Array(100) { 0 }

    // 배열에 요소 추가하기
    var arr1 = arrayOf<Int>(1, 2, 3, 4, 5)
    var arr2 = arr1.plus(6)
    println(arr2.contentToString())

    // 배열 슬라이싱
    println(arr1.sliceArray(0..2).contentToString())

    // 기타
    println(arr1.first())
    println(arr1.last())
    println(arr1.indexOf(3))
    println(arr1.average())
    println(arr1.count())
    println(arr1.reversedArray().contentToString())
    println(arr1.contains(1))
    println(1 in arr1)

    // 요소 순환
    arr1.forEach { element ->
        println("$element")
    }
    arr1.forEachIndexed { i, e -> println("arr[$i] = $e") }

    val iter : Iterator<Int> = arr1.iterator()
    while (iter.hasNext()){
        val e = iter.next()
        print(e)
    }
}