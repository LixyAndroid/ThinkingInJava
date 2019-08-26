package com.xuyang.thinkinginjava.Operators;

/**
 * @author Li Xuyang
 * date  2019/8/26 10:07
 * Exercise 5, page 105
 */

class Dog {
    String name;
    String says;
    void setName(String n) {
        name = n;
    }
    void setSays(String s) {
        says = s;
    }
    void showName() {
        System.out.println(name);
    }
    void speak() {
        System.out.println(says);
    }
}
public class DogTest {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("Spot");
        spot.setSays("Ruff!");
        Dog scruffy = new Dog();
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();
    }
}
