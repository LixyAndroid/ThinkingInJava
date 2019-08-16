package com.xuyang.thinkinginjava.EverythingIsAnObject;

/**
 * @author Li Xuyang
 * date  2019/8/16 11:49
 * Exericise 3, page 90
 * 定义内部类，并使用
 */
public class ATNTest {
    public static void main(String[] args) {

        class ATypeName {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }

        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();
    }
}
