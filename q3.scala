package practical_7

import scala.io.StdIn.readLine

object q3 {

  // Helper function to check if a number is prime
  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2) true
    else !(2 until num).exists(i => num % i == 0)
  }

  // Function to filter prime numbers from a list
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val input = readLine()

    val numbers = input.split(" ")  // "1 2 3 4 5" convert this to Array("1","","2","","3","","4","","5")
      .filter(_.nonEmpty)  // filter method used to remove empty strings from array. then Array("1","2","3","4","5")
      .map(_.toInt)  // each elements of the array converting each string to an integer. then Array(1,2,3,4,5)
      .toList  // Array becomes to List

    val primeNumbers = filterPrime(numbers)

    println(s"Prime numbers: $primeNumbers")
  }
}
