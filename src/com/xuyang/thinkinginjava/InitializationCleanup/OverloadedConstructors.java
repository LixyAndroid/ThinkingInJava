package com.xuyang.thinkinginjava.InitializationCleanup;

/**
 * @author Li Xuyang
 * date  2019/9/11 20:38
 * Exercise 9, page 172
 */


class Doc2 {
    Doc2(int i) {
        this("MD");
        int yearsTraining = i;
        System.out.println("New doc with " + i + " years of training");
    }
    Doc2(String s) {
        String degree = s;
        System.out.println("New doc with " + s + " degree");
    }
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}
public class OverloadedConstructors {
    public static void main(String[] args) {
        new Doc2(8).intubate();
    }
}
