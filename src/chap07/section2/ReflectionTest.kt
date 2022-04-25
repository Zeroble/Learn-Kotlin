package chap07.section2

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

annotation class ReplaceWith(val expression: String)
annotation class Deprecated(
    val message: String, val replaceWith: chap07.section2.ReplaceWith = ReplaceWith("")
)

@chap07.section2.Deprecated(
    "This function is deprecated, use === instead",
    chap07.section2.ReplaceWith("this === other")
)

class User(val id: Int, val name: String, var grade: String = "Normal") {
    fun check() {
        if (grade == "Normal") println("You need to get the Silver grade")
    }
}

fun main() {
    //타입을 출력
    println(User::class) //클래스 레퍼런스를 위해 ::class사용
    // 클래스의 프로퍼티와 메서드의 정보를 출력
    val classInfo = User::class

    classInfo.memberProperties.forEach {
        println("Property name : ${it.name}, type : ${it.returnType}")
    }
    println("--------------------------------------")
    classInfo.memberFunctions.forEach {
        println("Property name : ${it.name}, type : ${it.returnType}")
    }
    // 함수에 전달해 자료형을 알아냄
    getKotlinType(User::class)
}

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}