package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        boolean result1 = a<b+c;
        boolean result2 = b<a+c;
        boolean result3 = c<b+a;
        if (result1 & result2 & result3) {
            return true; }
            else return false;
        }


    public static boolean isRightTriangle(int a, int b, int c) {
        boolean result1 = a*a==b*b+c*c;
        boolean result2 = b*b==a*a+c*c;
        boolean result3 = c*c==b*b+a*a;
        if (result1 | result2 | result3) {
            return true; }
        else return false;}

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result1 = a==b;
        boolean result2 = b==c;
        boolean result3 = c==a;
        if (result1 | result2 | result3) {
            return true; }
        else return false;}

    public static void main(String[] args) {
        System.out.println(isTriangle(10,10,10));
        System.out.println(isRightTriangle(5,3,4));
        System.out.println(isIsoscelesTriangle(11,10,15));
    }
}

