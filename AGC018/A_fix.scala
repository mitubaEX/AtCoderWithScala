object Main{
  def gcd(x: Int, y: Int): Int =
    if(y > 0) gcd(y, x%y)
    else x

  def main(args:Array[String]) = {
    val tmp = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
    val list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
    var g: Int = 0
    for(s <- list){
      g = gcd(g, s)
    }
    if(tmp(1) % g == 0 && list.max >= tmp(1))
      println("POSSIBLE")
    else
      println("IMPOSSIBLE")
  }
}
