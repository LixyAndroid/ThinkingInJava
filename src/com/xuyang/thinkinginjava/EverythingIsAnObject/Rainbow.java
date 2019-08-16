package com.xuyang.thinkinginjava.EverythingIsAnObject;

/**
 * @author Li Xuyang
 * date  2019/8/16 12:07
 * Exercise 11, page 90
 */
public class Rainbow {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
        System.out.println("atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
        atc.changeColor(7);
        atc.changeTheHueOfTheColor(77);
        System.out.println("After color change, atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
        System.out.println("atc.hue = " + atc.hue);
    }
}
    class AllTheColorsOfTheRainbow {
        int anIntegerRepresentingColors = 0;
        int hue = 0;
        void changeTheHueOfTheColor(int newHue) {
            hue = newHue;
        }
        int changeColor(int newColor) {
            return anIntegerRepresentingColors = newColor;
        }
    }

