object Main{

  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines.map(_.toString).toList
    val splitList = list(0).split("")
    val leftsize = splitList.filter(n => n == "(").size
    val rightsize = splitList.filter(n => n == ")").size
    println(leftsize)
    println(rightsize)
    if(rightsize - leftsize)
  }
}
