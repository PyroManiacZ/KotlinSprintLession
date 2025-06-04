package org.example.Lession_1_10

fun main() {
    // лоические операторы
    // операторы сравнения
    // &&, ||, !
//    val a = 1 + 1
//    val b = (1 == 1)

    val userAge = 15
    val comparisonResult: Boolean = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)
    val result = userAge !in AGE_OF_MAJORITY..RETIREMENT_AGE
    print("Result is: $comparisonResult")

    val a = true
    val b = !a
    print(b)

}


//const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65