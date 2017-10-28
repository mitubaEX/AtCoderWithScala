object Main{

  // 次の行き先のリストをもらってきてそれに言って次のリストを問い合わせる
  var ans: Boolean = false

  def check(arr: Array[Array[Int]], now: Int = 0, count: Int = 0): Unit ={
    if(count > 2) ans = ans || false
    else if(now == arr.size - 1) ans = ans || true
    arr(now).zipWithIndex.filter(n => n._1 == 1).foreach(n => check(arr, n._2, count + 1))
  }

  def main(args:Array[String]) = {
    val map = scala.io.Source.stdin.getLines().toList
    val listTmp = map.head.split(" ").map(_.toInt)
    val mapTmp = map.tail
    println("hello")
    var arr:Array[Array[Int]] = Array.ofDim[Int](listTmp(0), listTmp(0))
    for(s <- mapTmp){
      var tmpString = s.split(" ")
      arr(tmpString(0).toInt - 1)(tmpString(1).toInt -1) = 1
    }
    check(arr)
    if(ans) println("POSSIBLE")
    else println("IMPOSSIBLE")
  }
}
