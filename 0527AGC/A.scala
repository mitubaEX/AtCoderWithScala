object Main{
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    val space = list(0) - 2
    val pattern = list(2) - list(1)
    if(list(2) - list(1) < 0){
      println(0)
    }else if(list(0) == 1){
      if(list(2) != list(1))
        println(0)
      else
        println(1)
    }else{
      println(pattern * space + 1)
    }
  }
}
