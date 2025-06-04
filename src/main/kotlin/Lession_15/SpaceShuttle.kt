package Lession_15

abstract class SpaceShuttle : Movable, Shootable {
    abstract val tankSzie: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSzie: Int) : SpaceShuttle() {
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeoff() {
        println("Развернуть крылья")
    }

    override fun prepareForLanding() {
        println("Свернуть крылья")
    }

    override fun startShooting() {
        println("Начать стрельбу")
    }

    override fun reloadGuns() {
        println("Перезарядить орудия N")
    }

}