package org.example.Lession_1_10

fun main() {
    printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName() : String? = readLine()

fun getAge() : Int? {
    println("Введите возраст:")
    return readLine()?.toInt()
}

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Данные пользователя: $userName, $userAge лет")
}