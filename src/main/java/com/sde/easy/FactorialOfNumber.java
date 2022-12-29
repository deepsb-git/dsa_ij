package com.sde.easy;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int op = facto(5);
        System.out.println("factorialOfNumber : " + op);
    }

    static int facto(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * facto(n - 1);
    }

}


