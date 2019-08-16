package com.xuyang.thinkinginjava.EverythingIsAnObject;

/**
 * @author Li Xuyang
 * date  2019/8/16 11:56
 *
 * Exercise 5, page 90
 */
public class DOTest2 {

    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }

        DataOnly data = new DataOnly();
        data.i = 234;
        data.d = 2.1234545;
        data.b = true;
        data.show();
    }
}
