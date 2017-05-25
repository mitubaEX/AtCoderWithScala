object Main{
  def patternMatch(str:String) = str match{
    case "a" | "t" | "c" | "o" | "d" | "e" | "r" => true
    case _ => false
  }

  def check(a:String, b:String):Boolean =
    if(a == b)
      true
    else{
      if(a == "@") patternMatch(b)
      else if(b == "@") patternMatch(a)
      else false
    }


  def main(args:Array[String]) = {
    val list = scala.io.StdIn.readLine.split("").map(_.toString).toList;
    val list2 = scala.io.StdIn.readLine.split("").map(_.toString).toList;
    val ans = (0 until list.size).map(n => {
      check(list(n), list2(n))
    });
    if(ans.filter(n => n == false).isEmpty)println("You can win")
    else println("You will lose")
  }
}
