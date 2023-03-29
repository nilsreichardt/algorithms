package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void testBubbleSortWithPositiveNumbers() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expectedOutput = {1, 2, 3, 4, 5};
        BubbleSort.sort(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testBubbleSortWithNegativeNumbers() {
        int[] input = {-5, -4, -3, -2, -1};
        int[] expectedOutput = {-5, -4, -3, -2, -1};
        BubbleSort.sort(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testBubbleSortWithMixedNumbers() {
        int[] input = {5, -4, 3, -2, 1};
        int[] expectedOutput = {-4, -2, 1, 3, 5};
        BubbleSort.sort(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testBubbleSortWithDuplicateNumbers() {
        int[] input = {5, 4, 3, 2, 1, 1};
        int[] expectedOutput = {1, 1, 2, 3, 4, 5};
        BubbleSort.sort(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {1, 2, 3, 4, 5};
        BubbleSort.sort(input);
        assertArrayEquals(expectedOutput, input);
    }
}