package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/10 22:27
 * Exercise 3, page 167
 */
class Kabayo {
    Kabayo() {
        System.out.println("isa lang kabayo");
    }
}

public class DefaultConstructorTest {
    public static void main(String[] args) {
        Kabayo k = new Kabayo();
    }
}