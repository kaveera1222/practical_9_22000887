object Q2 {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer argument.")
      System.exit(1)
    }

    try {
      val input = args(0).toInt

      val classifier: Int => String = {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }

      val result = classifier(input)
      println(result)

    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter a valid integer.")
    }
  }
}