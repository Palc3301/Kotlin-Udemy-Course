package secao13

import javax.xml.crypto.Data
fun main() {
    val f1: DataClass = DataClass(10, 10)
    var f2: DataClass = DataClass(10, 10)
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("---------------")
    println(f2.toString())
    println(f2.hashCode())

    f2 = f1.copy()
}
data class DataClass(val a: Int, val b: Int) {

}
//isso tudo se faz no data class
class Forma(val a: Int, val b: Int){
    override fun equals(other: Any?): Boolean {
        if (other is Forma) {
            return (other.a == this.a
                    && other.b == this.b)
        } else {
            return false
        }
    }
    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }
}
