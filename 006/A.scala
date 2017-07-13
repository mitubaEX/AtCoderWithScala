object Main{
  def main(args:Array[String]) = {
    val num = scala.io.StdIn.readLine.toInt;
    if(num % 3 == 0) println("YES")
    else println("NO")
  }
}
