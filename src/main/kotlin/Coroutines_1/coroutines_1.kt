package Coroutines_1

import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import java.util.Random

//fun main(): Unit = runBlocking {
//    val coroutines = List<Deferred<String>>(100) {
//        async(start = CoroutineStart.DEFAULT) {
////            doWork(it.toString())
//            if (isActive) {               // НЕ РАБОТАЕТ ПОТОМУ ЧТО В АСИНКЕ НАДО ЧТО-ТО ВЕРНУТЬ
//                doWork(it.toString())
//            }
//        }
//    }
//    coroutines.forEach { println(it.await()) }
//    coroutines.forEach { it.cancel() }
    coroutines.forEach { it.cancelAndJoin() }

}

suspend fun doWork(name: String): String {
    delay(Random().nextInt(5000).toLong())
    return "Done. $name"
}

//launch {
//    val result = doWork("Android Broadcast")
//    println(result)
//}

//repeat(100) {
//    launch {
//        val result = doWork(it.toString())
//        println(result)
//    }
//}

//async {
//    doWork(it.toString())
//}
//}