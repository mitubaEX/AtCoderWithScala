object Main{
  def updateMap(map: Map[String, Int], list:List[String]):Map[String, Int] = {
    list match{
      case (head :: Nil) => map
      case (head :: tail) => {
        if(map.contains(head)) updateMap(map.updated(head, map(head) + 1), tail)
        else updateMap(map.updated(head, 1), tail)
      }
    }
  }

  def main(args:Array[String]) = {
    val list = scala.io.Source.stdin.getLines().toList.tail
    val map = updateMap(Map(), list)
    // val tmp = map.maxBy(_._2).toString.split("")
    var num = 0
    var str = ""
    map.foreach(k => {
      if(num < k._2){
        num = k._2
        str = k._1
      }
    })
    println(str)
  }
}
