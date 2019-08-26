package com.xuyang.thinkinginjava.Operators;

/**
 * @author Li Xuyang
 * date  2019/8/26 12:49
 * Exercise 11, page 116
 */
public class RightShiftTest {
    public static void main(String [] args) {
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 28; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}
