package chap07.coffeeMaker

class Thermosiphon (heater:Heater) : Pump, Heater by heater{
    override fun pump() {
        if (isHot()){ // heater 의 메소드임
            println("[Thermosiphon] pumping...")
        }
    }
}