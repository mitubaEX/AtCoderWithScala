object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
    println((list(0) + 1) * (list(1) + 1) - list(0) + 1 - list(1) - list(1) - list(0) - 1)
  }
}
