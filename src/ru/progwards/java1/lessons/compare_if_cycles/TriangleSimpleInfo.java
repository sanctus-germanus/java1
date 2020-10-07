package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a>b & a>c) {
            return a;
        } else if (b>a & b>c) {
            return b;
        } else return c;
    }
    public static int minSide(int a, int b, int c) {
        if (a<b & a<c) {
            return a;
        } else if (b<a & b<c) {
            return b;
        } else return c;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean result1 = a==b;
        boolean result2 = b==c;
        if (result1==result2){
           return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(maxSide(10,11,53));
        System.out.println(minSide (10,11, 53));
        System.out.println(isEquilateralTriangle(11,10,10));
    }
}
