object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine
    if(list.toInt % 2 == 0)
      println(list.toInt / 2)
    else if(list.toInt % 2 == 1)
      println((list.toInt / 2) + 1)
  }
}
