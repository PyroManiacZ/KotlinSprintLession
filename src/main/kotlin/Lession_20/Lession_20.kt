package Lession_20

import java.util.Calendar

fun main() {

    // анонимыне функции
    // Лямда функции

    val calendar: Calendar = Calendar.getInstance()
    val getDaysToEndYear: () -> Long = fun(): Long = (365 - calendar[Calendar.DAY_OF_YEAR]).toLong()
//        return 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear())

    val convertEndDaysToMills: (Long) -> Unit = fun(endDays: Long) = println(1000 * 60 * 60 * 24 * endDays)
    convertEndDaysToMills(getDaysToEndYear())

    val printStringWithLambda: (Int) -> String

    printStringWithLambda = { answer: Int ->
        "print sting with lambda $answer"
    }

    println(printStringWithLambda(42));

    // короткая запись
    println({ it: Int -> "print sting with lambda2 $it" }(442 * 2))

    //конвепртация дней в миллисекунды
    val convertLambda = { endDays: Long ->
        println("Convert from lambda: ${1000 * 60 * 60 * 24 * endDays}")
    }

    convertLambda(getDaysToEndYear())


}

