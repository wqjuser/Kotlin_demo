package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/12
 */

val range: IntRange = 0..1024 // 闭区间[0,1024]
val range_exclusive: IntRange = 0 until 1024 //半开区间[0,1024)

val emptyRange: IntRange = 0..-1
fun main(args: Array<String>) {
    println(emptyRange.isEmpty())
    println(range.contains(1024))
    println(range_exclusive.contains(1024))
    for (i in range_exclusive) {
        print("$i,")
    }
}