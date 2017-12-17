package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/15
 */
class X

class A {
    var b = 0
    lateinit var c: String
    lateinit var d: X
    val e: X by lazy {
        println("init e")
        X()
    }
}

fun main(args: Array<String>) {
    println("start")
    val a = A()
    println("init a")
    println(a.b)
    a.d = X()
    println(a.d)
    println(a.e)

}