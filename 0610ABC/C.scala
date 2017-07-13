object Main{
  def check(num:Int):Int = {
    if(1 <= num && num <= 399)
      1
    else if(400 <= num && num <= 799)
      2
    else if(800 <= num && num <= 1199)
      3
    else if(1200 <= num && num <= 1599)
      4
    else if(1600 <= num && num <= 1999)
      5
    else if(2000 <= num && num <= 2399)
      6
    else if(2400 <= num && num <= 2799)
      7
    else if(2800 <= num && num <= 3199)
      8
    else
      10
  }

  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines.toList
    val result = list(1).split(" ").map(_.toInt).map(n => check(n))
    val condition = result.filter(n => n >= 9).size
    val min = result.filter(n => n < 9).distinct.size
    val max = min + condition
    println(Math.max(min,1) + " " +  max)

    // if(max >= 8)
    //   println(Math.max(min,1) + " " +  8)
    // else
    //   println(Math.max(min,1) + " " + max)
  }
}
