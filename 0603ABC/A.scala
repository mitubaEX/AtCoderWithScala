object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    val ans = list(0) + list(1)
    if(ans >= 10)
      println("error")
    else
      println(ans)
  }
}
