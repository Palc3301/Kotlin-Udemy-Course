package secao7

fun main() {
    println(exr1())
    println(exr2())
    exr3("Me contrata :)")
    println(exr4("xxooox"))
    println(exr4("xxxxo"))
    println(exr4("cdefghjij"))
    println(exr4("ooooxzzzzz"))
}

fun exr1 () {
    val caixa = 2000
    val capacidadeBalao = 7

    var numBaloes = 0
    while ((numBaloes * capacidadeBalao) + capacidadeBalao < caixa) {
        numBaloes++
    }
    println("Cabem $numBaloes baloes na caixa d'agua.")
}

fun exr2() {
    var i = 1
    while (i <= 50) {
        //if (i % 5 == 0 && i % 3 == 0){
        if (i % 15 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0){
            print("Buzz ")
        } else if (i % 5 ==0) {
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    }
}

fun exr3(str: String) {
    var i = str.length - 1
    while(i > 0) {
        print(str[i])
        i--
    }
}

fun exr4(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return countO == countX && countO != 0
}




