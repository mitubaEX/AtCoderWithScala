object Main{
  def fib(a:Long, b:Long, c:Long, current:Int,num:Int):Long =
    if(current == num) a + b + c
    else fib(b, c, a+b+c, current + 1, num)

  def main(args:Array[String]) = {
    val num = scala.io.StdIn.readLine.toInt;
    if(num <= 2) println(0)
    else if(num > 2 && num <= 4) println(1)
    else println(fib(0, 0, 1, 4,num) % 10007)
  }
}
