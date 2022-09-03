package secao11

fun main() {
    media(1f, 2f, 3f, 5.76f, 8f)
}

//vararg não limita os numeros de paramentros
fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return (soma / notas.size)
}