package Lession_18

import java.util.Date

fun main() {

    // ad hoc (по случаю) - много функций в классе а он определяет чем работать
    // subtyping (полиморфизм включения) - реализация через Solid
    // parametric (параметрический) - дженерики/ обобщённое програмирование

    val creationDate = Date()

    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate",
    )
    val phoneItem: NotesAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        89911424050,
    )
    val listItem: NotesAppItem = ListItem(
        "Todolist",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "Buy new shoes")
    )

//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())

    val arrayOfNotes = arrayOf<NotesAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)

}

fun showAllNotes(notes: Array<NotesAppItem>) {
    notes.forEach {
        println(it.getItemData())
    }
}

//    val note = NotesAppItem ()
//
//    note.addItemToCell(
//        "call sister",
//        creationDate,
//        "message",
//        "call sister to congratulate",
//    )
//    println()
//
//    note.addItemToCell(
//        "sister's number",
//        creationDate,
//        "phone",
//        89911424050,
//    )
//    println()
//
//    note.addItemToCell(
//        "Todolist",
//        creationDate,
//        "list",
//        listOf("wash dog", "do the cleaning", "Buy new shoes")
//    )
//    println()

