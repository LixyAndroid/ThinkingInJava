package com.xuyang.thinkinginjava;

import java.util.Random;

/**
 * @author Li Xuyang
 * date  2019/8/26 10:15
 * Exercise 7, page 106
 */
public class CoinToss {
    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt();
        if (coin % 2 == 0) System.out.println("heads");
        else System.out.println("tails");
    }
}
