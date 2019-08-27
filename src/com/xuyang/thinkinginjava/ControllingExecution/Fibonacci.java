package com.xuyang.thinkinginjava.ControllingExecution;

/**
 * @author Li Xuyang
 * date  2019/8/27 10:54
 * Exercise 9, page 153
 */
public class Fibonacci {
    int fib(int n) {
        if(n < 2) return 1;
        return (fib(n - 2) + fib(n - 1));
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int k = Integer.parseInt(args[0]);
        System.out.println("First " + k + " Fibonacci number(s): ");
        for(int i = 0; i < k; i++)
            System.out.println(f.fib(i));
    }
}
