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

// Complete the diagonalDifference function below.
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftSide = 0
    var rightSide = 0
    for(i in 0..arr.size - 1){
        for(x in 0..arr.size -1){
            leftSide+=arr[i][i]
            break
        }
    }

    for(i in 0..arr.size - 1){
        for(x in arr.size - 1 downTo 0){
            rightSide+=arr[i][x-i]
            break
        }
    }
    return Math.abs(leftSide - rightSide)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
