package chap07.section2

data class Customer(var name: String, var email: String) {
    var job: String = "Unkown"

    constructor(name: String, email: String, _job: String) : this(name, email) {
        job = _job
    }

    init {
        // 간단한 로직은 여기에
    }
}

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")

    println(cus1 == cus2)
    println(cus1.equals(cus2))
    println("${cus1.hashCode()}, ${cus2.hashCode()}")

    val cus3 = cus1.copy(name = "Alice") // cus1을 복사하면서 name을 변경
    println(cus1.toString())
    println(cus3.toString())

    // 객체 디스트럭처링
    val (name, email) = cus1
    println("name : $name, email : $email")

    var (_, iOnlyNeedEmail) = cus1
    println("email : $iOnlyNeedEmail")


    // 데이터가 많아진다면 list 이용
    val bob = Customer("Bob", "bob@mail.com")
    val erica = Customer("Erica", "erica@mail.com")
    val customer = listOf(cus1, cus2, cus3, bob, erica)

    for ((name, email) in customer) {
        println("name = $name, email = $email")
    }

    // 람다식을 이용해 변수 디스트럭처링하기
    val myLambda = { (nameLa, emailLa): Customer -> //소괄호로 묶어 하나의 객체로 람다식에 전달
        println(nameLa)
        println(emailLa)
    }
    myLambda(cus1)
}