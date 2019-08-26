package com.xuyang.thinkinginjava.Operators;

//import static net.mindview.util.Print.*;

/**
 * @author Li Xuyang
 * date  2019/8/26 9:58
 * Execise 3, page p98
 */

class Box {
    float a;
}
public class PassObject2 {

    static void f(Box y) {
        y.a = 2.71828f;
    }
    public static void main(String[] args) {
        Box x = new Box();
        x.a = 3.1416f;
  //      print("1: x.a = " + x.a);
        f(x);
  //      print("2: x.a = " + x.a);
    }
}
