package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2018/1/30
 */
fun main(args: Array<String>) {
    try {
        val a = args[0].toInt()
        val b = args[1].toInt()
        println("$a + $b = ${sum(a, b)}")
    } catch (e: NumberFormatException) {
        println("请输入整数！！！！")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("请输入两个整数")
    } catch (e: Exception) {
        println("程序出现未知错误")
    } finally {
        println("感谢使用加法计算器")
    }

}