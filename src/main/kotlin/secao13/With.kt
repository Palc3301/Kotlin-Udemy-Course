package secao13

fun main() {
    val p = Pessoa(2002,"Arruda")
    p.acordar()
    p.dormir()

    with(p) {
        this.acordar()
        this.dormir()
    }
}