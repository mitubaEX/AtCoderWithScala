object Main{
  def main(args:Array[String]) = {
    val input = scala.io.StdIn.readLine.toInt;
    // (1 to input).map(n => Math.round(10000.0 * n / input)).foreach(println);
    println((1 to input).map(n => Math.round(10000.0 * n / input)).sum);
  }
}
