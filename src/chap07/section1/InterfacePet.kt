package chap07.section1

open class Animal(val name: String)


interface Pet {
    var category: String // 아무것도 안붙이면 => 추상 프로퍼티
    val msgTags: String // 인터페이스는 값을 지정할 수 없지만, val 프로퍼티에 한하여 get으로 필요한 내용 구현 가능.
        get() = "I'm your lovely pet"
    val species: String

    fun feeding()
    fun patting() { //내용이 들어가면 -> 일반 메서드
        println("Keep patting!")
    }
}


class Cat(name: String, override var category: String) : Pet, Animal(name) {
    override val species: String  = "cat"

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

// feeding 의 구현을 위해 인터페이스 pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet {
    override val species: String = "dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}.")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")

    master.playWithPet(dog)
    master.playWithPet(cat)
}