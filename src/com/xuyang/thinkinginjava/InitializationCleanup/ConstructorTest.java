package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/1 21:32
 * Exercise 1, p158
 */


class Tester {
    String s;
}

public class ConstructorTest
{
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.s);
    }
}
