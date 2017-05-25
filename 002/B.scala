object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split("").map(_.toString).toList;
    list.filterNot(n => n == "a" || n == "i" || n == "u" || n == "e" || n == "o")
      .foreach(print)
    println()
  }
}
