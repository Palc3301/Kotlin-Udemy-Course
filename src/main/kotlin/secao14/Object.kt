package secao14

class Matematica{

    companion object {
        val PI = 3.1415
        fun teste() {}

        init {
            println("Fui inicializado.")
        }
    }

    object obj1 {
        val DIV2 = 2
        fun teste() {}
    }
}

fun main() {
    Matematica.PI
    Matematica.teste()
    Matematica.obj1.DIV2

    val m = Matematica
}