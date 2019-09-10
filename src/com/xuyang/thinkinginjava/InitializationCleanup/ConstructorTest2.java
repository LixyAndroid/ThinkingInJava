package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/10 22:24
 * Exercise 2, p158
 */
class Tester2 {
    String s1;
    String s2 = "hello";
    String s3;
    Tester2() { s3 = "good-bye"; }
}

public class ConstructorTest2 {
    public static void main(String[] args) {
        Tester2 t = new Tester2();
        System.out.println("t.s1: " + t.s1);
        System.out.println("t.s2: " + t.s2);
        System.out.println("t.s3: " + t.s3);
    }
}