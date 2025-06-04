package Lession_14

open class Spaceship (
    val name: String,
    val speed: Int,
    val unnamed: Boolean = false,
) {

    fun switchToWarpMode() {
        println("${name}: Переход в варп-режим")
    }

    open fun runSystemDiagnostic() {
        println("${name}: Запущена диагностика системы")
    }

}