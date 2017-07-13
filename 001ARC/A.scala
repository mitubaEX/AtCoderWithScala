object Main{
  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines.map(_.toString).filter(n => n != "").toList
    val tmp = list(1).split("").map(_.toInt)
    println(Math.max(Math.max(Math.max(tmp.filter(n => n == 1).size, tmp.filter(n => n == 2).size),tmp.filter(n => n == 3).size),tmp.filter(n => n == 4).size) + " " + Math.min(Math.min(Math.min(tmp.filter(n => n == 1).size, tmp.filter(n => n == 2).size),tmp.filter(n => n == 3).size),tmp.filter(n => n == 4).size))
  }
}
