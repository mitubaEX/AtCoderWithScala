object Main{
  def check(b:Int) : String =
      if(b < 1000) "0" + (b * 10 / 1000)
      else ""+(b * 10 / 1000)

  def getVV(a:Int) : String =
    if(a < 100) "00"
    else if(a >= 100 && a <= 5000)
      check(a)
    else if(a >= 6000 && a <= 30000) ""+ ((a + 50000) / 1000)
    else if(a >= 35000 && a <= 70000) ""+(((a - 30000) / 5 + 80000)/ 1000)
    else "89"

  def main(args:Array[String]) = {
    val num = scala.io.StdIn.readLine.toInt;
    println(getVV(num))
  }
}
