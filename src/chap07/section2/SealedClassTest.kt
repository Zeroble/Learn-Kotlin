package chap07.section2

// sealed class : 미리 묶어놓은 자료형들을 묶어서 제공 (Enum class 의 확장으로 볼 수 있다)
// 생성자는 private only

//-------------------------------------------------------------
// 실드 클래스를 선언하는 첫번째 방법
sealed class Result {
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}
// 클래스 밖에서 상속받아 만들 수도 있다!
// 이 방법으로 선언하면 사용할 때 . 표기를 사용하지 않고 바로 사용
class Status : Result()
class Inside : Result.Success("Status")
//-------------------------------------------------------------


fun main() {
    var result : Result = Result.Success("Good!")
    var msg = eval(result)
    println(msg)

    result = Result.Error(999, "Id Not Invaild")
    msg = eval(result)
    println(msg)

    // . 표기가 없는 것을 확인 가능
    result = Status()
    msg = eval(result)
    println(msg)
}

fun eval(result: Result): String = when (result) {
    is Status -> "In prograss!"
    is Result.Success -> result.message
    is Result.Error -> result.message
    // 모든 조건을 가지므로 else 가 필요하지 않다!
}
