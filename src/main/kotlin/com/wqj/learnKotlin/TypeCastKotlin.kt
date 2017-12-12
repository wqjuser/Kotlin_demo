package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/12
 */
fun main(args: Array<String>) {
    val parent: Parent = Parent()
    val child: Child? = parent as? Child
    println(child)
//    if (parent is Child) {
//        println(parent.name)
//    }

}