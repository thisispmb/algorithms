package com.thisispmb;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 9, 0, 4, 6, 1, 5, 2, 7, 8};
        System.out.println(Arrays.toString(arr));
        Algorithms.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}