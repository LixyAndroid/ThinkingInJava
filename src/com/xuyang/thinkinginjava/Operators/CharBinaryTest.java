package com.xuyang.thinkinginjava.Operators;

/**
 * @author Li Xuyang
 * date  2019/8/26 12:57
 * Exercise 13, page 116
 */
public class CharBinaryTest {
    public static void main(String [] args) {
        char c = 'a';
        System.out.println(Integer.toBinaryString(c));
        c = 'b';
        System.out.println(Integer.toBinaryString(c));
        c = 'c';
        System.out.println(Integer.toBinaryString(c));
        c = 'd';
        System.out.println(Integer.toBinaryString(c));
        c +=1;
        System.out.println(Integer.toBinaryString(c));
        c = 'A';
        System.out.println(Integer.toBinaryString(c));
        for(int i = 0; i < 26; i++) {
            c +=1;
            System.out.println(Integer.toBinaryString(c));
        }
    }
}
