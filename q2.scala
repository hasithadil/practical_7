package practical_7

import scala.io.StdIn.readLine

object q2 {
  def calculateSqure(numbers : List[Int]): List[Int] ={
    numbers.map(x => x * x)
  }

  def main(args: Array[String]): Unit={
    println("Enter a list of integers separated by spaces : ")
    val input = readLine()

    val numbers = input.split(" ") // "1 2 3 4 5" convert this to Array("1","","2","","3","","4","","5")
      .filter(_.nonEmpty) // filter method used to remove empty strings from array. then Array("1","2","3","4","5")
      .map(_.toInt) // each elements of the array converting each string to an integer. then Array(1,2,3,4,5)
      .toList // Array becomes to List

    val squreNumbers = calculateSqure(numbers)

    println(s"Squre numbers : $squreNumbers")
  }
}
