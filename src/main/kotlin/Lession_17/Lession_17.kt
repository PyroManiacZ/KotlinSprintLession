package Lession_17

fun main() {

    val fish = BabelFish(null)

    println("old value: ${fish.nerveSignalLevel}")
//    println("old value: ${fish.isTranslated}")
//    fish.nerveSignalLevel = readLine()?.toInt() ?: 0
//    println("new value: ${fish.nerveSignalLevel}")
//    println("old value: ${fish.isTranslated}")

    val fish2 = BabelFish(2)
    println("old value: ${fish2.nerveSignalLevel}")

    val fish3 = BabelFish(21)
    println("old value: ${fish3.nerveSignalLevel}")


}