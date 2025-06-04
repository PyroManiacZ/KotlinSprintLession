package Lession_16

fun main() {

    // public
    // privat
    // protected
    // internal

    val guide = HitchhikerGuide()
//    guide.title = "Don't panic"
//    guide.chooseArticle()
    println(guide.getNamberOfPages())
    guide.setNamberOfPages(42_000)
    println(guide.getNamberOfPages())


//    Support().printInfo()

}