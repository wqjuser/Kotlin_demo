package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/27
 */

private const val USERNAME = "wqj"
private const val PASSWORD = "123"
private const val ADMINUSERNAME = "test"
private const val ADMINPASSWORD = "123"
private const val DEBUG = 1
private const val USER = 0
fun main(args: Array<String>) {
    val mode = if (args.isNotEmpty() && args[0] == "1") {
        USER
    } else {
        DEBUG
    }
    println("请输入用户名:")
    val username = readLine();
    println("请输入密码:")
    val password = readLine()
    if (mode == DEBUG && username == ADMINUSERNAME && password == ADMINPASSWORD) {
        println("管理员登录成功")
    } else if (username == USERNAME && password == PASSWORD) {
        println("用户登录成功")
    } else {
        println("登录失败")
    }
}