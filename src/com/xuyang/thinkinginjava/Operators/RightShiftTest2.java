package com.xuyang.thinkinginjava.Operators;

/**
 * @author Li Xuyang
 * date  2019/8/26 12:52
 * Exercise 12, page 116
 */
public class RightShiftTest2 {
    public static void main(String [] args) {
        int h = -1;
        System.out.println(Integer.toBinaryString(h));
        h <<= 10;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 32; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}
