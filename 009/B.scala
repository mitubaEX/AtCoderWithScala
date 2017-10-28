object Main{
  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines.toList
    val max = list.tail.max
    println(list.tail.filter(_ != max).max)
  }
}
