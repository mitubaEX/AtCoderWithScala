import java.util.*
fun main(args: Array<String>){
    val cin = Scanner(System.`in`)
    /* print(cin.nextInt()+cin.nextInt()) */
    /* print(" ")                         */
    if(cin.next().contains("111") || cin.next().contains("222") ||cin.next().contains("333") || cin.next().contains("444")||cin.next().contains("555") || cin.next().contains("666")||cin.next().contains("777") || cin.next().contains("888") || cin.next().contains("999") || cin.next().contains("000")){
        println("Yes")
    } else {
        println("No")
    }
}

