package week1

import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val arr = Array(5){0}
    var sum = 0
    for(i in 0 until 5){
        arr[i] = sc.nextInt()
        sum += arr[i]*arr[i]
    }
    print(sum%10)
}