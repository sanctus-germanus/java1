package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
       double x=4*3.14*radius*radius*radius;
       double volume = x/3;
return volume;
    }
    public static float volumeBallFloat(float radius) {
        float a= (float) (4*3.14*radius*radius*radius);
        float volume = a/3;
        return volume;
    }
    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius)-volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        System.out.println (volumeBallDouble(1));
        System.out.println (volumeBallFloat(1));
        System.out.println (calculateAccuracy(1));
    }
}
