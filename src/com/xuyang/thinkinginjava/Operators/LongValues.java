package com.xuyang.thinkinginjava.Operators;

/**
 * @author Li Xuyang
 * date  2019/8/26 10:19
 * Exercise 8, page 109
 */
public class LongValues {
    public static void main(String[] args) {
        long n1 = 0xffff; // hexadecimal
        long n2 = 077777; // octal
        //Long.toBinaryString,这是一个long 转换为字符串
        System.out.println("long n1 in hex = " + Long.toBinaryString(n1));
        System.out.println("long n2 in oct = " + Long.toBinaryString(n2));
    }
}
