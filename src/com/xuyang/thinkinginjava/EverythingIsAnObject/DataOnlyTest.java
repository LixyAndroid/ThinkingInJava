package com.xuyang.thinkinginjava.EverythingIsAnObject;

/**
 * @author Li Xuyang
 * date  2019/8/16 11:54
 * Exercise 4 page 90
 * 同3
 */
public class DataOnlyTest {

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
        data.i = 3;
        data.d = 2.71828;
        data.b = false;
        data.show();
    }
}
