package secao14

interface Selvagem {
     fun atacar() {
         println("Mordida")
     }
}

abstract class Mamifero(var nome : String) {
    fun acordar() {
        println("Acordei")
    }
    fun dormir() {
        println("Dormi")
    }

    abstract fun falar()
}

//Mamifero aqui seria um extends do java
//Selvagem seria a Interface
class Cachorro(nome: String) : Mamifero(nome), Selvagem {
    override fun falar() {
        println("auuuu")
    }
}


 fun main(){


 }