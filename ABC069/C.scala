object Main{
  def main(args:Array[String]) = {
    val tmp = scala.io.StdIn.readLine
    val list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
    var four = List.empty[Int]
    var two = List.empty[Int]
    var oth = List.empty[Int]
    for(s <- list){
      if(s % 4 == 0)
        four = s :: four
      else if(s % 2 == 0)
        two = s :: two
      else
        oth = s :: oth
    }
    if(four.size >= oth.size - 1)
      println("Yes")
    else
      println("No")
  }
}
