package week1

import java.io.*;
import java.util.*;

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    print("${StringTokenizer(readLine(), " ").countTokens()}")
}