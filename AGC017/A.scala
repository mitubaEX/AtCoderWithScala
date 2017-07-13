object Main{
//  def fact(n: Int): Int = {
//    return (1 to n).foldLeft(1){ (a, b) => a * b }
//  }
//
//  def countRoute(h: Long, t: List[Long], p: Int, sum: Long, count: Int = 0, tmpCount: Int = 1): Int = {
//    t match {
//      case (head :: Nil) => {
//        if(sum / 2 == p && (head + sum) % 2 == p)
//          count + 1 + fact(tmpCount)
//        else if(sum / 2 == p)
//          count + fact(tmpCount)
//        else if((head + sum) % 2 == p)
//          count + fact(tmpCount)
//        else
//          count
//      }
//      case (head :: tail) => {
//        if(sum / 2 == p && (head + sum) % 2 == p)
//          countRoute(head, tail, p, head + sum, count + 1 + fact(tmpCount + 1), tmpCount + 1)
//        else if(sum / 2 == p)
//          countRoute(head, tail, p, head + sum, count + fact(tmpCount), tmpCount + 1)
//        else if((head + sum) % 2 == p)
//          countRoute(head, tail, p, head + sum, count + fact(tmpCount), tmpCount + 1)
//        else
//          countRoute(head, tail, p, head + sum, count, tmpCount + 1)
//      }
//      case _ => 0
//    }
//  }
//
//  def check(testCase: List[Long], p: Int): Int ={
//    testCase match {
//      case (head :: Nil) => {
//        if(head % 2 == p)
//          1
//        else
//          0
//      }
//      case (head :: tail) => countRoute(head, tail, p, head) + check(tail, p)
//      case _ => 0
//    }
//  }

  def addList(testCase: List[Long], limit: Int,count: Int = 0): List[List[Long]] ={
//    count match {
//      case limit => List(testCase)
//      case _ => List(testCase) ++ addList(testCase, count + 1, limit)
//    }
    if(count == limit) List(testCase)
    else List(testCase) ++ addList(testCase, limit, count + 1)
  }

//  def check(testCase: List[Long], p: Int): Int ={
//    for(
//      s <-
//    )
//  }
//
  def rekkyo(testCase: List[Long], limit: Int, index: Int = 0,ans: List[Int] = List.empty[Int], count: Int = 0): Unit = {
    if(limit == count)
      println(ans)
    else{
      for(s <- testCase.zipWithIndex){
        if(s._2 != index)
          rekkyo(testCase, limit, s._2.toInt, ans :+ s._1.toInt, count + 1)
      }
    }
  }

  def main(args:Array[String]): Unit = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    val testCase = scala.io.StdIn.readLine.split(" ").map(_.toLong).toList;
    val p = list(1).toInt
    val longlongList = addList(testCase, list(0).toInt)
    // longlongList.flatMap(n => n).fold()
    // println(longlongList)
    rekkyo(testCase, 5)
//    println(check(testCase, p))
  }
}
