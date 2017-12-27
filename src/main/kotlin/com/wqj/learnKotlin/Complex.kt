package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/27
 */
class Complex(var real: Double, var imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    override fun toString(): String {
        return "Complex(real=$real, imaginary=$imaginary)"
    }
}

class Book {
    infix fun on(any: Any): Boolean {//中缀表达式
        return true
    }
}

class Desk {

}

fun main(args: Array<String>) {
    val c1 = Complex(3.0, 4.0)
    val c2 = Complex(2.0, 7.5)
    println(c1 + c2)
    if (Book() on Desk()) {//dsl 里面常用
        println("YES")
    } else {
        println("NO")
    }
}