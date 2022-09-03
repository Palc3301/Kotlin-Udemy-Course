package secao13

class Pessoa(val ano: Int, var nome: String) {

    var olhos: String = ""
    fun dormir() {

    }
    fun acordar() {

    }
}

fun main() {
    var pessoa: Pessoa = Pessoa(2002, "Pedro")

    pessoa.nome
    pessoa.acordar()
    pessoa.dormir()
    pessoa.olhos = "Castanhos"
}