package com.thisispmb;

public class Algorithms {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = Utils.indexOfSmallestFrom(array, i);
            Utils.swap(array, smallest, i);
        }
    }
}
