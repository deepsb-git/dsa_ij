package com.sde.easy.code_ds;

public class DigitSumRecursive {
    public static void main(String[] args){
        int out=add(1234);
        System.out.println("out="+out);
    }
    static int add(int n){
        if(n==0){
            return 0;
        }
        return n%10 + add(n/10);
    }
}
