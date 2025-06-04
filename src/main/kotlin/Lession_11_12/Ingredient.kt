package Lession_11_12

class Ingredient(var name: String, var weight: Int, var count: Int) {

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

        this.isNeedToPrepare = isNeedToPrepare

    }

    init {
        println("Ингридиент $name создан")
    }

    // вторичный конструктор
    // первичынй конструктор
    // блоки init
    // тело вторичного конструткора

}