package secao13

class Receita {
    lateinit var instrucoes: String

    fun geraReceita() {
        instrucoes = "Lave as mãos"
    }

    fun imprimReceita() {
        if(this::instrucoes.isInitialized) {
            instrucoes = "Lave as mãos"
        }
    }


    fun main() {
        var r: Receita = Receita()
        r.geraReceita()
        println(r.instrucoes)
    }

}