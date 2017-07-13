object Main{
  def check(a:Int, b:Int):Int = {
    def run(num1:Int, num2:Int, count:Int) : Int = {
      if(num2 - num1 >= 10)
        return run(num1 + 10, num2, count + 1)
      else if(num2 - num1 == 7 || num2 - num1 == 8 || num2 - num1 == 3)
        return count + 3
      else if(num2 - num1 == 9 || num2 - num1 == 6 || num2 - num1 == 4 || num2 - num1 == 2)
        return count + 2
      else if(num2 - num1 == 0)
        return count
      else
        return count + 1
      // else if(num2 - num1 == 5 || num2 - num1 == 1)
      //   return 1
    }
    return run(a, b, 0)
  }
  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines.map(_.toString).filter(n => n != "").toList
    val tmp = list(0).split(" ").map(_.toInt)
    println(check(tmp(0), tmp(1)))

  }
}
