package week1

import java.util.Scanner
fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val num = sc.nextInt()
    val arr = Array(num){0}
    val Arr = DoubleArray(num){0.0}
    var max =0
    var sum: Double=0.0

    for(i in 0 until num){
        arr[i] = sc.nextInt()
        if(arr[i] > max) max = arr[i]
    }
    for(i in 0 until num){
        Arr[i] = arr[i].toDouble() / max.toDouble() * 100
        sum += Arr[i]
    }
    print(sum/num.toDouble())
}