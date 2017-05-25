object Main{
  def main(args:Array[String]) = {
    scala.io.Source.stdin.getLines.toList.map(n => n.split(" ")).filter(n => n.length >= 3).reverse.foreach(n => println(n(3) + " " + n(2) + " " + n(1) + " " + n(0)))
  }
}
