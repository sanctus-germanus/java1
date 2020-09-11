package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static String reverseDigits(int number) {
        int s = number % 10;
        number = number / 10;
        int c = number % 10;
        int b = number / 10;
        return String.valueOf(s) + c + b;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigits(564));
    }
}
