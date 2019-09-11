package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 20:30
 * Exercise 6, page 167
 */
class Dog2 {
    void bark() {System.out.println("quiet");}
    void bark(char c) {System.out.println("cawcaw");}
    void bark(byte b) {System.out.println("barkbark");}
    void bark(short s) {System.out.println("slurpslurp");}
    void bark(int i) {System.out.println("iyow");}
    void bark(long L) {System.out.println("lalala");}
    void bark(float f) {System.out.println("fififoofum");}
    void bark(double d) {System.out.println("dodo");}
    void bark(char c, int i) {System.out.println("caw-iyow");}
    void bark(int i, char c) {System.out.println("iyow-caw");}
}
public class DogTalk2 {
    public static void main(String[] args) {
        Dog2 d2 = new Dog2();
        char c = 'c';
        byte b = 0;
        short s = 0;
        d2.bark();
        d2.bark((char)c);
        d2.bark((byte)b);
        d2.bark((short)s);
        d2.bark(1);
        d2.bark(1L);
        d2.bark(1.0f);
        d2.bark(1.0);
        d2.bark(c, 1);
        d2.bark(1, c);
    }
}
