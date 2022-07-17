package one.digitalinovatioon.collections

fun main() {
    val Joao = Funcionario("Joao", 3000.0, "CLT")
    val Maria = Funcionario("Maria", 5000.0, "PJ")
    val Pedro = Funcionario("Pedro", 2000.0, "CLT")

    println("-------------------------------------")
    val Funcionarios = mutableListOf(Joao, Maria)
    Funcionarios.forEach { println(it) }

    println("-------------------------------------")
    Funcionarios.add(Pedro)
    Funcionarios.forEach { println(it) }

    println("-------------------------------------")
    Funcionarios.remove(Joao)
    Funcionarios.forEach { println(it) }

    println("---------------SET--------------------")
    val FuncionarioSet = mutableSetOf(Joao)
   // FuncionarioSet.forEach { println(it) }

    println("-------------------------------------")
    FuncionarioSet.add(Pedro)
    FuncionarioSet.add(Maria)
    FuncionarioSet.forEach { println(it) }

    println("-------------------------------------")
    FuncionarioSet.remove(Maria)
    FuncionarioSet.forEach { println(it) }

}