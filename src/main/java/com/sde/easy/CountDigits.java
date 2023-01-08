package com.sde.easy;

public class CountDigits {
    public static void main(String[] args){
        int n=12343;
        int count=0;

        while(n>0){
            int remainder=n%10;
            if(remainder==3){
                count++;
            }
            n=n/10;
            }
        System.out.println("count: " + count);
        }
    }
    

