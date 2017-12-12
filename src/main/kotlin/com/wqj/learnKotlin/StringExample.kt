package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/12
 */
val astring: String = "Hello wqj"
val achars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', ' ', 'w', 'q', 'j'))
val aInt: Int = 1
val bInt: Int = 2
val bString: String = "Hello \"你是?\""
val salary: Int = 10000
val cString:String= "sdada"
fun main(args: Array<String>) {
    println(astring == achars)
    println(astring === achars)
    println("我们要输出：" + astring)
    println("$aInt + $bInt = ${aInt + bInt}")
    println(bString)
    println("$$salary")
    println("\$salary")
    println(cString)
    println(cString.length)
}