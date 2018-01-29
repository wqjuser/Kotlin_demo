package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2018/1/22
 */
fun main(args: Array<String>) {
//    for (arg in args) {
//        println(arg)
//    }
//    for ((index, value) in args.withIndex()) {
//        println("$index->$value")
//    }
//    for (indexValue in args.withIndex()) {
//        println("${indexValue.index}->${indexValue.value}")
//    }
//    val list = MyIntList()
//    list.add(1)
//    list.add(2)
//    list.add(3)
//    for (i in list) {
//        println(i)
//    }
    var x = 5
    while (x > 0) {
        println(x)
        x--
    }
    do {
        println(x)
        x--
    } while (x > 0)
}

class MyInerator(val inerator: Iterator<Int>) {
    operator fun next(): Int {
        return inerator.next()
    }

    operator fun hasNext(): Boolean {
        return inerator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()
    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.remove(int)
    }

    operator fun iterator(): MyInerator {
        return MyInerator(list.iterator())
    }
}