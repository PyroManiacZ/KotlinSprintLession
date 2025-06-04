package org.example

fun main(){

    val ingridient1 = "яйцо"
    val ingridient2 = "помидор"
    val ingridient3 = "зелень"
    val ingridient4 = "соль"
    val ingridient5 = "перец"

    val arrayOfIngredients: Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    val intArray1: IntArray =  intArrayOf(4,4,2)
    val charArray1: CharArray = charArrayOf('4','4','2')


//    val intArray2 = arrayOf()


    var intArray3 = intArrayOf(1,2,3,4,5)
    intArray3 = intArrayOf(1,2,3,4,5)

//    println("Размер массива с ингридиентами: ${arrayOfIngredients.size}")

//    println(arrayOfIngredients.indexOf("помидор"))
//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[2])
//    println(arrayOfIngredients[5]) // error

//    arrayOfIngredients[4] = "паприка"
//    println(arrayOfIngredients[4])

    arrayOfIngredients.set(1, "капуста")
    arrayOfIngredients.get(1)
//    println(arrayOfIngredients[1])

    for (i in arrayOfIngredients){
        println("Ингридиент ${arrayOfIngredients.indexOf(i) + 1}: $i")

    }


}