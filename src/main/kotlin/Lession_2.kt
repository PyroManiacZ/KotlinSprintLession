package org.example

fun main(){
    val a = 5
    val b = 7
    val sum = a + b
    val c1 = 888
    val c2: Int

//    println(sum)
//    println(10 / 3)

    val complexExpression = (a + b) * 2 - 4 / 2
    println(complexExpression)

    // статок от деления
    println(10 % 3)
    println(10 % 2)

    // конечный тип переменной
//    val f = intNum + floatNum
//    println(f)


    // инкремент, декремент
    var counter = 0

    counter = counter + 1
    counter += 1
    counter++

    println(counter)

    // операторы сравнения
    // a = 5, b = 7
    println(a < b)
}