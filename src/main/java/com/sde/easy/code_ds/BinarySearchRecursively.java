package com.sde.easy.code_ds;

public class BinarySearchRecursively {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 11, 13, 14, 15};
        int n = arr.length;
        System.out.println("length of the array : " + n);
        int target = 15;
        System.out.println(search(arr, target, 0, n - 1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);

    }
}
