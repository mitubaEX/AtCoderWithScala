object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split("").toList
    println(list.head+""+(list.size - 1 - 1)+""+list(list.size - 1))
  }
}
