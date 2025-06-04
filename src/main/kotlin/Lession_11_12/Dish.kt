package Lession_11_12

class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {

    fun addToFavorites() {
        println("Блюдо $name добавлено в избраное")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("Блюдо $name удалено из избраного")
        inFavorites = false
    }

    fun startCooking() {
        println("Пользователь перешёл на экран начала приготовления блюда $name")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }

}