package Lession_14

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int,
) : Spaceship(name, speed) {

    fun handleDataFromRadar() {
        println("$name: обработка данных радара")
    }

    fun runAfterburner() {
        println("$name: форсаж запущен")
    }

}