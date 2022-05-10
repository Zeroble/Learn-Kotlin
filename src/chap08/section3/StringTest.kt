package chap08.section3

fun main() {
    // 문자열 자르기
    val s = "abcdefu"
    println(s.subSequence(1..3))
    println(s.substring(1..3))

    // 문자열 비교
    val s1 = "abcdefu"
    val s2 = "abcdeFU"
    println(s.compareTo(s2))
    println(s.compareTo(s2, true)) // 대소문자 무시
    println(s1 == s)

    // 스트링빌더
    // 가변 형태의 string, 다만 처리속도가 느리고 메모리를 많이 사용
    var sb = StringBuilder("Hello")
    sb[2] = '!'
    println(sb)

    sb.append("World")
    println(sb)
    sb.insert(10, "Added")
    println(sb)
    sb.delete(5, 10)
    println(sb)

    // 문자열 -> Int
    println("123".toInt())
    println("123ABC".toIntOrNull())

    // 문자열 원본 내용 유지
    val text = """
        asdf
        zxcv
        qwer
    """.trimIndent() // trimIndent => 들여쓰기를 제거해준다.
        .trimMargin()
    println(text)

    // 형식 문자 사용
    val pi = 3.1415926
    val dec = 10
    val hw = "hello"
    println("pi = %.2f, %3d, %s".format(pi, dec, hw))
}