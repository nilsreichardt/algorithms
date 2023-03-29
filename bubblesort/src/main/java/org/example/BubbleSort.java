package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = IntStream.iterate(10, i -> i - 1).limit(11).toArray();
        System.out.println("Before: " + Arrays.toString(array));

        BubbleSort.sort(array);
        System.out.println("After: " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                // Check if previous (i) element is larger the next element (j)
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
