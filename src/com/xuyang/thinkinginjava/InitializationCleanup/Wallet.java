package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 21:05
 * Exercise 22, page 207
 */

 enum Bills1 {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}
public class Wallet
{
    Bills1 b;
    public static void main(String[] args) {
        for(Bills1 b : Bills1.values()) {
            System.out.print("Worth: ");
            switch(b) {
                case ONE: System.out.println("$1"); break;
                case FIVE: System.out.println("$5"); break;
                case TEN: System.out.println("$10"); break;
                case TWENTY: System.out.println("$20"); break;
                case FIFTY: System.out.println("$50"); break;
                case HUNDRED: System.out.println("$100"); break;
                default: break;
            }
        }
    }
}
