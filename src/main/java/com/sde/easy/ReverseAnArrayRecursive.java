package com.sde.easy;

import java.util.Arrays;

public class ReverseAnArrayRecursive {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("input is :" + Arrays.toString(arr));
        int n=arr.length;
        reverse(arr,0,n-1);
        System.out.println("reverse is :" + Arrays.toString(arr));
    }
    static void reverse(int[] arr,int start,int end){
        if(start>=end)return;

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverse(arr,start+1,end-1);
    }
}
