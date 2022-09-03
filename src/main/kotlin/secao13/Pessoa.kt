package secao13

class Pessoa(val ano: Int, var nome: String) {
    var olhos: String = ""

    //pode ser null
    var doc: String? = null
    //this instancia da classe-se refere ao objeto
    constructor(ano: Int, nome: String, doc:String) : this(ano,nome){
        this.doc = doc
        this.nome = nome
    }
    fun dormir() {

    }
    fun acordar() {

    }
}

class Vazia
//classe não pode ser instanciada
//class Vazia private constructor()


fun main() {

    var pessoa: Pessoa = Pessoa(2002, "Pedro", "3301")

    //construtor
    Vazia()
    //-----------------
    pessoa.nome
    pessoa.acordar()
    pessoa.dormir()
    pessoa.olhos = "Castanhos"
    pessoa.doc
}