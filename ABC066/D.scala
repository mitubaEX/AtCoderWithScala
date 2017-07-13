object Main{
  def check(num: Int = 0, limit: Int, list: List[Long], newList: List[Long] = List()): List[Long] = {
    if(num == limit) newList
    else {
      println(newList)
      check(num + 1, limit, list.tail :+ list.head, (newList :+ list.head).reverse)
    }
  }

  def main(args:Array[String]) = {
    val a = scala.io.StdIn.readLine;
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    var evenList = List()
    var oddList = List()
    val evenList = (0 until list.size).foreach(n =>{
      if(n % 2 == 0)
        evenList :+ list(n)
      else if(n % 2 == 1)
        list(n) +: oddList
    })
    // val evenList = (0 until list.size).filter(n => n % 2 == 0).map(n => list(n))
    // val oddList = (0 until list.size).filter(n => n % 2 == 1).map(n => list(n))
    println((oddList ++ evenList).mkString(" "))
  }
}
