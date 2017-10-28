object Main{

  val tmp = List(1, 2, 3, 4, 8, 16, 32, 64)
  def check(num: Int): Int = if(tmp.contains(num)) num else check(num - 1)
  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine
    println(check(list.toInt))
  }
}
