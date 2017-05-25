object Main{
  def main(args:Array[String]) = {
    val ans = scala.io.Source.stdin.getLines.toList.filter(n => n != "").tail.min
    println(ans)
    // scala.io.Source.stdin.getLines.toList.filter(n => n != "").tail.foreach(println)
  }
}
