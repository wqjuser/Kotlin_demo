package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/12
 */
fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
//    val name: String = getName() ?: return
//    println(name.length)
    val value:String?="jdjadjad"
    println(value!!.length)
}