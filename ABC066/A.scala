object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    val ans = Math.min(Math.min(list(0) + list(1), list(0) + list(2)), list(1) + list(2))
    println(ans)
  }
}
