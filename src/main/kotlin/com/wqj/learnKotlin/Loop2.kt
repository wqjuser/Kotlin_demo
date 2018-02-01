package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2018/1/30
 */
class Student {
    fun isNotClothedProperly(): Boolean {
        return false
    }
}

fun main(args: Array<String>) {
    val students = ArrayList<Student>()
    val you = Student()
    for (student in students) {
        if (student == you) break
        if (student.isNotClothedProperly()) {
            break
        }
    }
}