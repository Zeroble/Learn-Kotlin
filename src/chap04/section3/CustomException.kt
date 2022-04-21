package chap04.section3

class InvaildNameException(message: String) : Exception(message) //사용자 정의 예외 클레스

fun main() {
    var name = "killdong123"
    try {
        validateName(name)
    }catch (e : InvaildNameException){
        println(e.message)
    }catch (e: Exception){
        println(e.message)
    }
}

fun validateName(name: String) {
    if (name.matches(Regex(".*\\d+.*"))){
        throw InvaildNameException("your name : $name : Contains numerals.")
    }
}
