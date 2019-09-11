package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 21:04
 * Exercise 21, page 207
 */
public class EnumEx21 {
    public enum Bills {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }
    public static void main(String[] args) {
        for(Bills b : Bills.values())
            System.out.println(b + ", ordinal " + b.ordinal());
    }
}
