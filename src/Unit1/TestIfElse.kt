package Unit1

/**
 * Created by user on 1/6/2560.
 */
fun main(args : Array<String>) {
    var x = 10
    var y : Int = 12
    if (x > y) println("x more than y") else println("x less than y")

    if(x is Int) println(true) else println(false)
}

