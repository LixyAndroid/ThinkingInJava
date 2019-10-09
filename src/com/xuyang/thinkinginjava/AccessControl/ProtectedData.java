package com.xuyang.thinkinginjava.AccessControl;

/**
 * @author Li Xuyang
 * @date : 2019/10/9 21:21
 * Exercise 6, page 228
 */
public class ProtectedData {
    public static void main(String[] args) {
        SomeData x = new SomeData();
        System.out.println(x.a);
        DataChanger.change(x, 99);
        System.out.println(x.a);
    }
}
class SomeData {
    protected int a = 13;
}

class DataChanger {
    static void change(SomeData sd, int i) { sd.a = i; }
}