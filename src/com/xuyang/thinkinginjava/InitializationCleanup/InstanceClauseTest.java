package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 20:54
 * Exercise 15, page 193
 */
class Tester1 {
    String s;
    {
        s = "Initializing string in Tester";
        System.out.println(s);
    }
    Tester1() {
        System.out.println("Tester()");
    }
}

public class InstanceClauseTest {
    public static void main(String[] args) {
        new Tester1();
    }
}
