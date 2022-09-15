package secao15

fun main() {

    listOf<Int>()

    val set1: Set<String> = setOf<String>("Amsterdam", "Tokyo", "Rio")
    val set2: MutableSet<String> = mutableSetOf<String>()

    print(set1)

    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2.contains("São Paulo")

    set2.clear()
    set2.size

}