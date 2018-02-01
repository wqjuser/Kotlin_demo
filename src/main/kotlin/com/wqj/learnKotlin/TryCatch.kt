package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2018/1/30
 */
fun main(args: Array<String>) {
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        0
    }



    println(result)
}