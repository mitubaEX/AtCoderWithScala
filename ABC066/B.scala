object Main{
  def check(str: String, strList: String, count: Int = 0): Int = {
    if(strList.take(str.length()) == str)
      check(str, strList.drop(str.length()), count + str.length())
    else {
      if(count % 2 != 0)
        count - str.length()
      else if(count == str.length())
        0
      else
        count
    }
  }

  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.init;
    val strList = list.split("")

    println((1 to list.length()).map(n => check(list.take(n), list)).max)
  }
}
