import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'twoStrings' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s1
 *  2. STRING s2
 */

fun twoStrings(s1: String, s2: String): String {
    // Write your code here
    var answer = "NO"
    for (i in s1){
        if (i in s2){
            answer = "YES"
            break
        }
    }
    return answer
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s1 = readLine()!!

        val s2 = readLine()!!

        val result = twoStrings(s1, s2)

        println(result)
    }
}