package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        if (number < 0) {
            number = -number;
        }
        if (number == digit) {
            return true;
        }
        do {
            int a = number % 10;
            if (a == digit) return true;
            else number = number / 10;
        } while (number != 0);
        return false;
    }

    public static int fiboNumber(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        for (int i = 1; i <= n - 2; ++i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double e = 1.61703;
        double f = 1.61903;
        boolean result1 = (double) a / (double) b >= e;
        boolean result2 = (double) a / (double) b <= f;
        boolean result3 = a == b;
        boolean result4 = a == c;
        boolean result5 = c == b;
        boolean result6 = (double) b / (double) a >= e;
        boolean result7 = (double) b / (double) a <= f;
        boolean result8 = (double) a / (double) c >= e;
        boolean result9 = (double) a / (double) c <= f;

        return (result3 & result8 & result9) | (result4 & result1 & result2) | (result5 & result6 & result7);
    }


    public static void main(String[] args) {
        for (int n = 1; n <= 15; ++n) {
            System.out.println(fiboNumber(n));
        }
        for (int a = 1; a <= 100; ++a) {
            for (int b = 1; b <= 100; ++b) {
                for (int c = 1; c <= 100; ++c) {
                    if (isGoldenTriangle(a, b, c)) {
                        System.out.print(a + " ");
                        System.out.print(b + " ");
                        System.out.println(c);
                    }
                }
            }

        }
    }
}




