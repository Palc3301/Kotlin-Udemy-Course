package secao13

enum class Prioridade(val id: Int) {
    Baixa(33){
        override fun toString(): String{
            return "Prioridade baixa: $id}"
        }
             },
    Media(0),
    Alta(1)
}
enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Macaco, Lobo
}

fun main() {
    for (p in Prioridade.values()) {
        println(p)
    }
}