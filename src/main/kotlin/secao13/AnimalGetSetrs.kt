package secao13

class AnimalGetSetrs(var especie: String) {
    var fala: String = ""
    //quando alguma logica vai ser executada
        get() {
            println("Acesso Get")
            return field
        //field faz com que não fique recursivo
        }
    set(value) {
        println("Acesso Set")
        field = value
    }
}

fun main() {
    println(AnimalGetSetrs("cachorro").fala)
    var a = AnimalGetSetrs("cachorro")
    a.fala = "auuuuu"
}