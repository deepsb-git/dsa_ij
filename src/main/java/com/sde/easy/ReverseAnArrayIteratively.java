package com.sde.easy;

import java.util.Arrays;

public class ReverseAnArrayIteratively {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("input is :" + Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int n=arr.length;
        System.out.println("length : " + n);
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
}
