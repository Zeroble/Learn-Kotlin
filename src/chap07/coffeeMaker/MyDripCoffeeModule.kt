package chap07.coffeeMaker

class MyDripCoffeeModule : CoffeeModule{
    companion object {
        // by lazy 를 이용한 지연 초기화
        val electricHeater :ElectricHeater by lazy {
            ElectricHeater()
        }
    }

    //임시적인 private 프로퍼티 이용 => 외부에서 초기화 불가능, 오직 getThermosiphon() 에 의하여 초기화 될 수 있다.
    private val _thermosiphon : Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }

    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}