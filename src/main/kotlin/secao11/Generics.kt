package secao11

fun main() {
    println(media(1f, 2f, 3f, 5.76f, 8f))

    arrayOf(2,3,4,5,6,7,45f,false)
    "asfasfasf".startsWith("sd", )
}

//vararg não limita os numeros de paramentros
//Padrão generics T
fun <T, J> media(vararg notas: T,abc: J): Float {
    var soma = 0f
    for (n in notas) {
        //se n é float...
        if (n is Float) {
            soma += n
        }
     }
    return (soma / notas.size)
}
