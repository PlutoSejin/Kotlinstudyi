package week1

import java.util.Scanner
fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val num = sc.nextInt()

    for(i in 0 until num){
        for(j in num-2-i downTo 0){
            print(" ")
        }
        for(j in 0..i){
            print("*")
        }
        println("")
    }

}