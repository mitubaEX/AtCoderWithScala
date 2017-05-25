object Main{
  def createList():Any = for(line <- scala.io.Source.stdin.getLines)yield line



  def main(args:Array[String]) = {
    val num = scala.io.StdIn.readLine.toInt;
    val list = createList()
    list.foreach(print _)
  }
}
