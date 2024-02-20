
class Funcionario(nome: String, idade: Int, email: String, cargo: String) extends Pessoa(nome: String, idade: Int, email: String) {
  def exibirInfoFuncionario(): Unit = {
    exibirInformacoes()

    println(s"Cargo: $cargo")
  }
}
