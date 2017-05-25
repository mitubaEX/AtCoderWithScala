object Main{
  def update(n:Int,num:Int, list : List[Int]):List[Int] =
    if(n == num) list
    else update(n + 1, num, list.updated((n % 5), list((n % 5 + 1))).updated((n % 5) + 1, list((n % 5))))

  def main(args:Array[String]) = {
    val num = scala.io.StdIn.readLine.toInt;
    val list = List(1,2,3,4,5,6)
    val newList = update(0 , num, list);
    newList.foreach(print)
    println
  }
}
