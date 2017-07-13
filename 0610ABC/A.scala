object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    val ans = list(0) * 100 + list(1) * 10 + list(2)
    if(ans % 4 == 0)
      println("YES")
    else
      println("NO")
  }
}
