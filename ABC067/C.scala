object Main extends App{
  val list: List[Int] = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList;
  val l: List[Int] = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList;
  val sum: Int = l.sum
  var x: Int = 0
  var ans: Int = Int.MaxValue
  for(s <- (0 until list(0))){
    x += l(s)
    if(s + 1 < list(0))
      ans = Math.min(ans, Math.abs(sum - 2 * x))
  }
  println(ans)
}
