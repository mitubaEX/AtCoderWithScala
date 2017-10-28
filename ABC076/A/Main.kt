import java.util.*

fun solve(index: Int, a: String, b: String): String?{
    val count = a.drop(index).mapIndexed{i, n -> if(n.compareTo(b.get(i)) == 0 || n.compareTo('?') == 0) true else false}.count { it }
    if(count == a.drop(index).length){
        return a.take(2).toList().joinToString().replace(", ", "") + b
    } else{
        return null
    }
}

fun check(a: String, b: String): List<Int>{
    var count = 0
    val list: MutableList<Int> = mutableListOf()
    for(i in a){
        if(i.compareTo(b.get(0)) == 0){
            list.add(count)
        }
        count++
    }
    return list
}

fun main(args: Array<String>){
	val cin = Scanner(System.`in`)
    val n = cin.next()
    val k = cin.next()

    // 部分文字列が入るかどうかを確かめる
    // その後は辞書順
    /* println(k.get(0)) */
    val index = check(n, k)
    /* println(index) */

    val ansList = listOfNotNull(index.mapNotNull{m -> solve(m, n, k)})
    /* println(ansList) */
    val ans = ansList.flatMap{n -> n}.map{m -> m.replace("?", "a")}.sorted()
    if(ans.size > 0){
        println(ans.get(0))
    } else {
        println("UNRESTORABLE")
    }
}

