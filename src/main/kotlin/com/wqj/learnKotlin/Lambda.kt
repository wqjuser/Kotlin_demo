package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/14
 */
var sum2 = { a: Int, b: Int ->
    println("$a+$b=${a + b}")
    a + b
}//lambda 表达式 实际的结果是表达式的最后一行的结果

fun main(args: Array<String>) {
    println(sum2(1, 2))
    println(sum2.invoke(1, 2))
    args.forEach ForEach@ {
        if (it == "123") return@ForEach
        println(it)
    }
    println("The END")
}
