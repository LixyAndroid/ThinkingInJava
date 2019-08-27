package com.xuyang.thinkinginjava.ControllingExecution;

/**
 * @author Li Xuyang
 * date  2019/8/27 10:40
 * Exercise 7, page 146
 */
public class IntCount {
    static void Count1(int n) {
        for(int i = 0; i < n; i++)
            System.out.println(i + 1);

    }
    static void Count2(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i + 1);
            if(i == 99)
                break;
        }
    }
    static void Count3(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i + 1);
            if(i == 99)
                return;
        }
    }
    public static void main(String[] args) {
        Count1(100);
        Count2(100);
        Count3(100);
    }
}
