package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/27
 */

fun main(args: Array<String>) {
    val x = 5
    when (x) {
        is Int -> println("yes")
        in 1..100 -> println("yes..")
        !in 0..1 -> println("no..")
    }
    val mode = when {
        args.isNotEmpty() && args[0] == "1" -> 1
        else -> 0
    }
}