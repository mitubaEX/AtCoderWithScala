object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList;
    val l = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList.sortWith(_>_);

    println(l.take(list(1)).sum)
  }
}
