package one.digitalinovatioon.collections

fun main() {
    val Joao = Funcionario("Joao", 3000.0, "CLT")
    val Maria = Funcionario("Maria", 5000.0, "PJ")
    val Pedro = Funcionario("Pedro", 2000.0, "CLT")

    val Repositorio = Repositorio<Funcionario>()

    Repositorio.create(Joao.nome, Joao)
    Repositorio.create(Maria.nome, Maria)
    Repositorio.create(Pedro.nome, Pedro)

    println(Repositorio.findById(Maria.nome))

    println("----------------------------------------")
    Repositorio.findAll().forEach { println(it) }

    println("----------------------------------------")

    println(Repositorio.remove(Maria.nome))
    Repositorio.findAll().forEach { println(it) }

}