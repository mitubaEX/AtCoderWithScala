object Main{
  def main(args:Array[String]) = {
    // val list = scala.io.StdIn.readLine.split(" ").map(_.toString).toList
    // println(list)
    var list = List.empty[String]
    scala.io.Source.stdin.getLines.toList.map(n => n.split(" ")).foreach(n => list :+= n(0))
    println(list)
  }
}
