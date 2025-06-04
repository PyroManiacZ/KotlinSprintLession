package Lession_16

private val supportInfo = "Support Info"

class HitchhikerGuide {

    val title = ""
    private var numberOfPages = 9999

    private fun chooseArticle() {
        println("Open catalog")
    }

    fun getNamberOfPages() = numberOfPages
    fun setNamberOfPages(number: Int) {
        numberOfPages = number
    }

}

class Support {

    fun printInfo() {
        println(HitchhikerGuide::class.simpleName)
        println(HitchhikerGuide().title)
        println(supportInfo)
    }


}