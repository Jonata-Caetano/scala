object RunCodes {

  def genericsCodes(): Unit = {

    val number: Int = 5
    val text: String = "This is a text"
    val numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val temperature: Double = 35.5
    val count: Long = 10000L
    val students: Map[String, Double] = Map("Alice" -> 90.0, "Bob" -> 85.5, "Charlie" -> 95.0)
    val testSet = Set("Alice", 35, 35.5, "Text")

    val filteredNumbers = filterNumbersAbove3(numbers)

    println(number)
    println(text)
    println(numbers)
    println(temperature)
    println(count)
    println(students)
    println(testSet)
    println(filteredNumbers)

  }

  def filterNumbersAbove3(numbers: List[Int]): List[Int] = numbers.filter(_ > 3)

}
