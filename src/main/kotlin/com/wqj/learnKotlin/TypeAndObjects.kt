package com.wqj.learnKotlin

/**
 * Created by MR.WEN on  2017/12/12
 */


class 妹子(性格: String, 长相: String, 声音: String) : 人(性格, 长相, 声音) {
}

class 帅哥(性格: String, 长相: String, 声音: String) : 人(性格, 长相, 声音) {

}

open class 人(val 性格: String, val 长相: String, val 声音: String) {
    init {
        println("new 了一个${this.javaClass.simpleName}，ta性格$性格,长相$长相,声音$声音")
    }
}

fun main(args: Array<String>) {
    val 我喜欢的妹子: 妹子 = 妹子("温柔", "漂亮", "动听")
    帅哥("彪悍", "帅气", "浑厚")
    println(我喜欢的妹子 is 人)

}
