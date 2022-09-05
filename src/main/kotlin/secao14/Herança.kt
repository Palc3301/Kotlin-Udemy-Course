package secao14

//private limita e o construtor pertence a classe somente
private class x ()

//protected da acesso apenas as classes heradadas
open class Eletronico(var marca: String) {
    private fun corrente(ativo: Boolean){}
    fun ligar() {
        corrente(true)
    }
    open fun desligar() {
        corrente(false)
    }
}

class Computador(marca: String) : Eletronico(marca){
    fun save() {}
    override fun desligar(){
        save()
        super.desligar()
    }
}

fun main() {
    var c: Computador = Computador("DELL")

    c.ligar()
    c.desligar()
    //c.marca
}