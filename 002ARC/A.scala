object Main{
  def checkUruu(num: Int) : String = {
    if(num % 4 == 0){
      if(num % 100 == 0){
        if(num % 400 == 0)
          "YES"
        else "NO"
      }
      else "YES"
    }
    else "NO"
  }

  def main(args:Array[String]) = {
    val num = scala.io.StdIn.readLine.toInt;
    println(checkUruu(num))
  }
}
