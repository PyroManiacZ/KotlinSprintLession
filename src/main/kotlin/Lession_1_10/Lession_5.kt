package org.example.Lession_1_10

fun main() {
    val userAge = readln().toInt()

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show special content"
    } else if (userAge == 16 || userAge == 17) {
        "Show limited content"
    } else {
        "Back to Lession_13_22.Lession_14.main screen"
    }
//    println(resultText)

    val consoleNumber = when(userAge) {
        10 ->  {
            println("Additional actions")
            "Your number is 10"
        }
        20 ->  "Your number is 20"
        42 ->  "Your number is 42"
        else -> "Another number"
    }
    println(consoleNumber)
}

const val AGE_OF_MAJORITY = 18


