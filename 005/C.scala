object Main{
  def check(n:Int, T:Int, mList:List[Int]):Boolean =
    if(!mList.map(m => m - n <= T && m - n >= 0).isEmpty) true
    else false

  def main(args:Array[String]) = {
    val T = scala.io.StdIn.readLine.toInt;
    val N = scala.io.StdIn.readLine.toInt;
    val nList = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList;
    val M = scala.io.StdIn.readLine.toInt;
    val mList = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList;
    println(nList.map(n => check(n, T, mList)).count(n => n == true))
    println(mList.size)
    if(nList.map(n => check(n, T, mList)).count(n => n == true) >= mList.size)
      println("yes")
    else println("no")
  }
}
