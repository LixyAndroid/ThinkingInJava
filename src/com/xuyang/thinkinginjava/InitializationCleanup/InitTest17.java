package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 20:57
 * Exercise 17, page 198
 */
class InitTest {
    InitTest(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}

public class InitTest17 {
    public static void main(String[] args) {
        InitTest[] it = new InitTest[10];
    }
}
