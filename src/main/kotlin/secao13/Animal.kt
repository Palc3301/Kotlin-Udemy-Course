package secao13

class Animal(var especie: String) {
//bloco que vai ser executado quando a class
// for criada
    var fala: String = ""
    init {
        if (especie == "cachorro"){
            fala = "auau"
        } else if (especie == "gato") {
            fala = "Miau"
        } else {
            ""
        }
    }
    fun falar() {
        println(fala)
    }
}

fun main() {
    var animal = Animal("cahorro")
    Animal("cahorro").falar()
}