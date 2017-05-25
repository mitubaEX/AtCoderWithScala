object Main{
  // def check(a : Int) : Int = {
  //
  // }

  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList;
    val list2 = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList;
    val k = list(1)
    val sortList = list2.sorted.takeRight(k)
    // println(sortList.map(n => check(n)).sum)
    var ans:Double = 0.0
    for(s <- sortList){
      ans = (ans + s) / 2.0
    }
    println(ans)
  }
}
