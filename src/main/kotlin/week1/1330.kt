package week1

import java.util.Scanner
fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    if (a > b) print(">")
    else if (a < b) print("<")
    else print("==")
}