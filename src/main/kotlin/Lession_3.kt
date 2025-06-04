package org.example

fun main() {

    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"

    // катенация строк
//    println(greeting + ", " + userName + "!" + space + "What is your main question")

    // интерполяция строк
//    println("$greeting, $userName! What is your main question")
//    println("To which you can respond ${40 + 2}")

    val multiString = """
        |fdfffffffffff
           |fddddddddddd
              |f   fdsssssss
    """.trimMargin()

//    println(multiString)


    val phrase = "And he said - \"it is magnificent!\""
    println(phrase)
}