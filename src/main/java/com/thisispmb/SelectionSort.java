package com.thisispmb;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, smallest, i);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = 0;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
            }
        }

        for (int i = 0; i < table.length; i++) {
            if (table[i] == smallest) {
                index = i;
                break;
            }
        }

        return index;
    }
}
