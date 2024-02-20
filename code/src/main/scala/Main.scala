@main def hello(): Unit =
  println("Hello world!")
  println(msg)

  RunCodes.genericsCodes()

  println("----------------- ** -----------------")

  val pessoal = new Pessoa(nome = "Vinicius", idade = 36, email = "teste@teste.com")
  pessoal.exibirInformacoes()

  println("----------------- ** -----------------")

  val pessoa2 = new Pessoa(nome = "Guilherme", idade = 33, email = "teste@teste.com")
  pessoa2.exibirInformacoes()

  println("----------------- ** -----------------")

  val funcionario = new Funcionario(nome = "Vinicius", idade = 36, email = "teste@test.com", cargo = "Developer")
  funcionario.exibirInfoFuncionario()

  println("----------------- ** -----------------")

  val dog = new Dog()
  dog.makeSound()

  val cat = new Cat()
  cat.makeSound()

  println("----------------- ** -----------------")

  val duck = new Duck();
  duck.swim()
  duck.fly()

def msg = "I was compiled by Scala 3. :)"
