package org.example;

public class Main {
    public static int dec(int a, int b)
    {
        return a - b;
    }
    public static double div(double a, double b)
    {
        return a / b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a = 5, b = 2;

        System.out.println(sum(a, b));
        System.out.println(dec(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
    }
}