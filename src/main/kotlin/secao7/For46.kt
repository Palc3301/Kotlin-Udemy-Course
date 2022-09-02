package secao7

fun main(){
    ex1()
    println(ex2())
    println(ex3())
    println(ex4())
    println(ex5())
    ex6(5)
}

fun ex1() {
    for( i in 1..50){
        print("$i ")
    }
}

fun ex2() {
    for (i in 1 downTo 50) {
        print("$i ")
    }
}
fun ex3() {
    for( i in 1..50){
        if(i%5 == 0) {
            continue
        }
        print("$i ")
    }

}

fun ex4() {
    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }
}

fun ex5() {
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
}

fun ex6(n: Int){
    var contador = 0
    for(i in 1..n) {
        contador = i
        for( j in 1..contador) {
            print('#')
        }
        println()

    }

}

