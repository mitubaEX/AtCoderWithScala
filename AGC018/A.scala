object Main{
  // sub以下のmax
  def maxAbs(list: List[Int], sub: Int): Int = {
    var max = 0
    for(i <- (0 until list.size)){
      for(j <- (i until list.size)){
        var calcAns = Math.abs(list(i) - list(j))
        if(list(i) != list(j) && calcAns <= sub && !list.contains(calcAns)){
          max = Math.max(max, calcAns)
        }
      }
    }
    max
  }

  def check(list: List[Int], k: Int): Boolean = {
    val sub = list.max - k
    var ans = maxAbs(list, sub)
    if(ans == sub)
      true
    else if(ans == 0)
      false
    else
      check(ans :: list, sub)
  }

  def main(args:Array[String]) = {
    val tmp = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
    val list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
    if(list.contains(tmp(1)))
      println("POSSIBLE")
    else if(check(list, tmp(1)))
      println("POSSIBLE")
    else
      println("IMPOSSIBLE")
  }
}
