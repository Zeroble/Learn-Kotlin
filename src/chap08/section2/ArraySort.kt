package chap08.section2

import java.util.*

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    val sortedNums = arr.sortedArray()
    println("ASC : " + sortedNums.contentToString())

    val sortedNumbersDesc = arr.sortedArrayDescending()
    println("DEC : " + sortedNumbersDesc.contentToString())

    // 원본 데이터를 정렬하기
    arr.sort(1, 3) //fromIdx, toIdx
    println("ORI : " + arr.contentToString())
    arr.sortDescending()
    println("ORI : " + arr.contentToString())

    // List로 변환하기
    val listSorted = arr.sorted()
    val listDesc = arr.sortedDescending()
    println("List sorted : $listSorted")
    println("List desSorted : $listDesc")

    // sortBy를 이용한 특정 표현식으로 정렬하기
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> -item.length } // 길이가 긴 순으로 정렬.
    println(items.contentToString())
}