package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/13
 */
val FINAL_HELLO_WORLD: String = "HelloWorld"//常量不可变
var hello_world: String = "HelloWorld"
val FINAL_HELLO_CHINA = "HelloChina"
fun main(args: Array<String>) {
    println(FINAL_HELLO_WORLD)
    println(FINAL_HELLO_CHINA)
    println(hello_world)
    println("hello,${args[0]}")
    println(sum(2, 3))
    println(sum1(2, 4))
}

fun sum(a: Int, b: Int) = a + b
var sum1 = { a: Int, b: Int ->
    println("$a+$b=${a + b}")
    a + b
}