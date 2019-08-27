package com.xuyang.thinkinginjava.ControllingExecution;

/**
 * @author Li Xuyang
 * date  2019/8/27 10:16
 * Exercise 4, page 139
 */
public class Primes {
    public static void main(String[] args) {
        for(int i = 1; i < 1000; i++ ) {
            int factors = 0;
            for(int j = 1; j < (i + 2)/2; j++ ) {
                //factors 用来控制，如果余数等于0，说明能除尽，不是素数
                if((i % j) == 0) factors++;
            }
            if(factors < 2) System.out.println(i + " is prime");
        }
    }
}
