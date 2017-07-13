object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split("").map(_.toString).toList;
    if(list(0) == "a" && list.size == 1) println(-1)
    else println("a")
  }
}
