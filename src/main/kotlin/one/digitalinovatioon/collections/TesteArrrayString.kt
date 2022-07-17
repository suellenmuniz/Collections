package one.digitalinovatioon.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Jose"
    nomes[2] = "Julia"

    for (nome in nomes) {
        println(nome)
    }
   println("------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("------------------------")
    val nomes2 = arrayOf("Maria", "Bruna", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }

}