object Main{
  // import java.lang.Math
  def returnTerm(a : Double , b:Double):Double = math.max(a, b) - math.min(a, b)

  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split(" ").map(_.toDouble).toList
    val under = math.sqrt(returnTerm(list(0), list(2)) * returnTerm(list(0), list(2)) + returnTerm(list(1), list(3)) * returnTerm(list(1), list(3)))
    val right = math.sqrt(returnTerm(list(0), list(4)) * returnTerm(list(0), list(4)) + returnTerm(list(1), list(5)) * returnTerm(list(1), list(5)))
    val left = math.sqrt(returnTerm(list(4), list(2)) * returnTerm(list(4), list(2)) + returnTerm(list(5), list(3)) * returnTerm(list(5), list(3)))
    val cos = (under * under + right * right - left * left) / (2 * under * right)
    val sin = math.sqrt(1 - (cos * cos))
    val answer = under * right * sin / 2
    printf("%.1f\n", answer)
  }
}
