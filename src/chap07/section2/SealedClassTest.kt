package chap07.section2

// sealed class : 미리 묶어놓은 자료형들을 묶어서 제공 (Enum class 의 확장으로 볼 수 있다)
// 생성자는 private only

// 실드 클래스를 선언하는 첫번째 방법
//sealed class Result {
//    open class Success(val message: String) : Result()
//    class Error(val code: Int, val message: String) : Result()
//}
//
//class Status : Result()
//class Inside : Result.Success("Status")

//실드 클래스 선언하는 두번째 방법
sealed class Result2

open class Success2(val message: String) : Result2()
class Error2(val code: Int, val message: String) : Result2()

class Status2 : Result2()
class Inside2 : Result2.Success("Status")