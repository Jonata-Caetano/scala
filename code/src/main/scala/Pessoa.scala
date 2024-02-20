
class Pessoa(nome: String, idade: Int, email: String) {

  def exibirInformacoes(): Unit = {
    println(s"Nome: $nome")
    println(s"Idade: $idade")
    println(s"Email: $email")
    
  }
}
