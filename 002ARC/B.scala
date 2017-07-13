object Main{
  def checkInt(num: Any) : Unit = num match{
    case a : Double => println("Double")
    case a : Int => println("Int")
    case _ => println("other")
  }

  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split("/").map(_.toInt).toList
    implicit val a = list(0) / list(1)
    implicit val b = a / list(2)
    checkInt(b)
  }
}
