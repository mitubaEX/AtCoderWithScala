object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split("").map(_.toString).toList;
    val sortedList = list.sorted

    val ans = sortedList.zip(sortedList.tail).map { n => n._1 == n._2}
    if(ans.find(n => n == true).isEmpty)
      println("yes")
    else
      println("no")
  }
}
