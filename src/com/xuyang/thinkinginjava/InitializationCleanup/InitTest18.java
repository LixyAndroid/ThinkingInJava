package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 20:59
 * Exercise 18, page 198
 */
class InitTest1 {
    InitTest1(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}

public class InitTest18 {
    public static void main(String[] args) {
        InitTest1[] it = new InitTest1[5];
        for(int i = 0; i < it.length; i++)
            it[i] = new InitTest1(Integer.toString(i));
    }
}
