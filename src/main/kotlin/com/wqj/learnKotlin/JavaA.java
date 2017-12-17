package com.wqj.learnKotlin;

/**
 * Created by MR.WEN on  2017/12/15
 */
public class JavaA {
    private int b = 0;

    public int getB() {
        System.out.println("some one want to get b");
        return b;
    }

    public void setB(int b) {
        System.out.println("some one want to set b");
        this.b = b;
    }
}
