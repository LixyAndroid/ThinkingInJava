package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 20:36
 * Exercise 8, page 170
 */
class Doc {
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}
public class PassingThisEx{
    public static void main(String[] args) {
        new Doc().intubate();
    }
}
