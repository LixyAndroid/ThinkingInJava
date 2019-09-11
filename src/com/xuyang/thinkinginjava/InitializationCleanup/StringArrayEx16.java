package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 20:56
 * Exercise 16, page 198
 */
public class StringArrayEx16 {
    public static void main(String[] args) {
        String[] s = { "one", "two", "three", };
        for(int i = 0; i < s.length; i++)
            System.out.println("s[" + i + "] = " + s[i]);
    }
}
