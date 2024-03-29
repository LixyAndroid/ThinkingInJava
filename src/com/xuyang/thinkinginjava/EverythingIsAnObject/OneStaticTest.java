package com.xuyang.thinkinginjava.EverythingIsAnObject;

/**
 * @author Li Xuyang
 * date  2019/8/16 12:02
 * Exercise 8, page 90
 * 使用第7的定义的类
 */
public class OneStaticTest {

    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        st1.i = 3;
        System.out.println("After st1.i = 3, ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("Create another StaticTest, st3.");
        StaticTest st3 = new StaticTest();
        System.out.println("st3.i = " + st3.i);
    }
}

//class StaticTest {
//    static int i = 47;
//}
//
//class Incrementable {
//    static void increment() { StaticTest.i++; }
//}
