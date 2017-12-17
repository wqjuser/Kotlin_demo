package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/15
 */
class Gril(val character: String, val sound: String, val looks: String) {
    fun Singing(songname: String) {
        println("The Girl singing the song $songname")
    }

    fun dancing(danceName: String) {
        println("The Girl dangce the $danceName")
    }
}

fun main(args: Array<String>) {
    val AGirl = Gril("Kind", "Nice to hear", "Pretty")
    AGirl.Singing("成都")
    AGirl.dancing("cilicili舞")
}