package com.xuyang.thinkinginjava.AccessControl;

/**
 * @author Li Xuyang
 * @date : 2019/10/9 21:12
 * Exercise 4, page 227
 */
public class CookieMonster {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        x.bite(); // package access to protected method
    }
}
