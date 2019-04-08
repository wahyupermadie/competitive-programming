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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var plus = 0.0
    var zero = 0.0
    var minus = 0.0
    var total = 0.0
    for(i in arr.indices){
        if(arr[i] > 0){
            plus += 1
        }
        if(arr[i] == 0){
            zero += 1
        }
        if(arr[i] < 0){
            minus += 1
        }
        total += 1
    }

    var plusRatio = plus / total
    var minusRatio = minus / total
    var zeroRatio = zero / total

    println(plusRatio)
    println(minusRatio)
    println(zeroRatio)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
