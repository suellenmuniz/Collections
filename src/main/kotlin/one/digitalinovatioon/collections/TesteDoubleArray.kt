package one.digitalinovatioon.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 2000.0
    salarios[1] = 3000.0
    salarios[2] = 5000.0

    salarios.forEach { println(it) }

    println("--------------------------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("--------------------------------------------")
    val salario2 = doubleArrayOf(1500.0, 1240.0, 3000.0)
    salario2.sort()
    salario2.forEach { println(it) }

}