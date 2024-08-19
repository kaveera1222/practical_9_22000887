object Q3 {

  def main(args: Array[String]): Unit = {
  
    val toUpper: String => String = _.toUpperCase
    val toLower: String => String = _.toLowerCase

    val formatNames: String => (String => String) => String = name => formatter => formatter(name)

    println(formatNames("Benny")(toUpper))

    println(formatNames("Niroshan")(str => str.take(2).toUpperCase + str.drop(2).toLowerCase))

    println(formatNames("Saman")(toLower))

	println(formatNames("Kumara")(str => str.head.toUpper + str.tail.init.toLowerCase + str.last.toUpper))
  }
}