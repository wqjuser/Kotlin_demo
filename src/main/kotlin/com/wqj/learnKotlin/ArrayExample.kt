package com.wqj.learnKotlin

import com.wqj.learnKotlin.水果.苹果.水果

/**
 * Created by MR.WEN on  2017/12/12
 */
val intArray: IntArray = intArrayOf(1, 2, 2, 3, 4)
val charArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', ' ', 'w', 'q', 'j')
val stringArray: Array<String> = arrayOf("wpsjo", "dasdas", "hhh")
val arrayof水果: Array<水果> = arrayOf(水果(12), 水果(56))
//val stringArrayTest:StringArray= stringArray("","")//目前stringArray是一个类，但并不是数组类型
fun main(args: Array<String>) {
    println(intArray.size)
    println(charArray.size)
    println(stringArray.size)
    println(arrayof水果.size)
//    for (a in intArray)
//        print("$a,")
    println(arrayof水果[1])
    println(charArray.joinToString(""))
    println(stringArray.slice(1..2))
}