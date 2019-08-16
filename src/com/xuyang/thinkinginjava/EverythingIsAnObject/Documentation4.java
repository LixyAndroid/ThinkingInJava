package com.xuyang.thinkinginjava.EverythingIsAnObject;

import java.util.Date;

/**
 * @author Li Xuyang
 * date  2019/8/16 12:22
 * Exercise 14, page 90
 */
public class Documentation4 {
    /** Let's try a public field list
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    public int i = 2;

    /**
     * A private field list (-private to see)
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    private int j = 3;

    /**
     * Another list can be inserted here to help explain the
     * following method call
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol><br>
     * but may be formatted differently in Method Summary
     */

    public static void main(String[] args) {

        /**
         * Let's try another test list here
         * <ol>
         * <li> One
         * <li> Two
         * <li> Three
         * </ol>
         */

        Date d = new Date();
        System.out.println("d = " + d);
    }
}
