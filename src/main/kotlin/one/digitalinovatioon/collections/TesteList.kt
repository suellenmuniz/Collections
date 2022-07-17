package one.digitalinovatioon.collections

fun main() {
    val Joao = Funcionario("Joao", 3000.0, "CLT")
    val Maria = Funcionario("Maria", 5000.0, "PJ")
    val Pedro = Funcionario("Pedro", 2000.0, "CLT")

    val Funcionarios = listOf(Joao, Pedro, Maria)

    Funcionarios.forEach { println(it) }

    println("-----------------------")
    println(Funcionarios.find { it.nome == "Maria" })

    println("-----------------------")
    Funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("-----------------------")
    Funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String

) {
    override fun toString(): String =
        """
            nome:   $nome
            salario: $salario
        """.trimIndent()

}