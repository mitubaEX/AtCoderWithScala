object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    println(list(1)/list(0))
  }
}
