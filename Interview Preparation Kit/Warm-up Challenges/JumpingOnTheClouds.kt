import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    var jump = 0
    var position = 0

    while (position < c.size-2){
        if (c[position + 2] == 0) {
            position += 2
            jump += 1
        }else{
            position += 1
            jump += 1
        }
    }
    if (position != c.size-1){
        jump += 1
    }
    return jump
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
