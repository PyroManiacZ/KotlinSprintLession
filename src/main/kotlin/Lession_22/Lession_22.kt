package Lession_22

fun main() {

    // class vs data class
    // equals() - сравнение 2х объектов (через data сравнивает инициализированное значение)
    // hashCode() - уникальный код объекта
    // toString() - строковое ПОНЯТНОЕ представление
    // copy() копирование объекта в другой объект

    val word1 = Word("Red", "Красный")
    val word2 = Word("Red", "Красный")
    val word3 = Word("White", "Белый")
//    println(word1 == (word2))
//    println(word2.equals(word3)) // модно и так и так

//    val word4 = word3.copy(translate = "Правильный перевод: Белый")
//    println(word3)
//    println(word4)

    println(word1.hashCode())
    println(word2.hashCode())
    println(word3.hashCode())

}


data class Word(
    val text: String,
    val translate: String,
)


//data class Word(
//    val text: String,
//    val translate: String,
//)


//{
//    // для генерации сочетание Alt + Ins
//    override fun toString(): String {
//        return "Word(text='$text', translate='$translate')"
//    }
//}