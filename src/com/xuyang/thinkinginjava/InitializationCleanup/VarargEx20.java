package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 21:01
 * Exercise 20, page 204
 */
public class VarargEx20 {
    public static void main(String... args) {
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
}
