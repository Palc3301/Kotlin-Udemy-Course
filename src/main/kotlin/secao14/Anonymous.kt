package secao14

interface Event {
    fun onSucess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo conexões.")
        println("Salvando Valores.")
        println("Sucesso. Conexões Fechadas.")
        e.onSucess()
    }
}

fun main() {
    val p = Programa()
    p.salvar (object : Event {
        override fun onSucess() {
            print("onSucess")
        }
    })
}