object Main{
  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines.toList
    val max = list(1).split(" ").map(_.toLong).max
    val min = list(1).split(" ").map(_.toLong).min
    println(max - min)
  }
}
