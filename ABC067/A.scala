object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    if(list(0) % 3 == 0)
      println("Possible")
    else if(list(1) % 3 == 0)
      println("Possible")
    else if((list(0) + list(1)) % 3 == 0)
      println("Possible")
    else
      println("Impossible")
  }
}
