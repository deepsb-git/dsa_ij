package com.sde.easy;

public class ReverseNumRecur {
    public static void main(String[] args){
        rev(1234);
        System.out.println("reverse of num : " + sum);
    }
    static int sum=0;
    static void rev(int num){
        if(num==0) return;
        int rem=num%10;
        sum=sum*10+rem;
         rev(num/10);
    }
}
