object Main{
  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines().filter(n => n != "").map(_.toLong).toList
    val ans = list.tail.map(n => {
      if(n % 10 == 0)
        0
      else
        n
    }).zipWithIndex.map(n => n._1 * n._2).sum
    println(ans)
  }
}
