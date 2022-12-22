package com.sde.easy;

public class Fibonacci {
    public static void main(String[] args){
        int op=fibo(4);
        System.out.println("fibo: " + op);
    }
    static int fibo(int n) {
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
