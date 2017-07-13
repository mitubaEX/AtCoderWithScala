object Main{

  def getSubListSum(list:List[Int], subNum:Int, a:Int, b:Int):Int = list.map(n => (n - subNum)/(a-b)).filter(n => n >= 0).sum
  def nibun(list:List[Int], a:Int, b:Int):Int = {
    var t = 0
    var bool = true
    while(bool){
      t += 1
      // println(t)
      // println(getSubListSum(list, t * b, a, b))
      if(getSubListSum(list, t * b, a, b) <= t){
        bool = false
      }
    }
    return t
    // var ans = 1000000000
    // var now = list.max
    // var right = list.max
    // var left = 1
    // while(true){
    //   println(now)
    //   println(right)
    //   println("subNum:" + getSubListSum(list, now * b))
    //   if(getSubListSum(list, now * b) <= now){
    //     ans = Math.min(ans, now)
    //     right = now
    //     now = (right + left) /2
    //   }else{
    //     left = now;
    //     now = right + left / 2
    //   }
    // }
    // return 0
  }

  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines().filter(n => n != "").map(_.toString).toList
    val tmp = list(0).split(" ")
    val a = tmp(1)
    val b = tmp(2)
    val list2 = list.tail.map(_.toInt).sorted

    println(nibun(list2, a.toInt, b.toInt))

  }
}
