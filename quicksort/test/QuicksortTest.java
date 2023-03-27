import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuicksortTest {
    @Test
    void testEmptyArray() {
        int[] emptyArray = new int[]{};
        Quicksort.sort(emptyArray);
        assertArrayEquals(new int[]{}, emptyArray);
    }

    @Test
    void testSingleElementArray() {
        int[] singleElementArray = new int[]{7};
        Quicksort.sort(singleElementArray);
        assertArrayEquals(new int[]{7}, singleElementArray);
    }

    @Test
    void testAlreadySortedArray() {
        int[] alreadySortedArray = new int[]{1, 2, 3, 4, 5};
        Quicksort.sort(alreadySortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, alreadySortedArray);
    }

    @Test
    void testReverseSortedArray() {
        int[] reverseSortedArray = new int[]{5, 4, 3, 2, 1};
        Quicksort.sort(reverseSortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, reverseSortedArray);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arrayWithDuplicates = new int[]{5, 3, 8, 3, 5, 3, 9};
        Quicksort.sort(arrayWithDuplicates);
        assertArrayEquals(new int[]{3, 3, 3, 5, 5, 8, 9}, arrayWithDuplicates);
    }

    @Test
    void testRandomArray() {
        int[] array = new int[]{42, 23, 17, 27, 71, 15, 87, 10, 12, 8, 60};
        int[] sortedArray = new int[]{8, 10, 12, 15, 17, 23, 27, 42, 60, 71, 87};

        Quicksort.sort(array);
        assertArrayEquals(sortedArray, array);
    }

    @Test
    void testLargeRandomArray() {
        Random random = new Random();
        int[] largeArray = new int[1000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = random.nextInt(1000);
        }
        int[] largeArrayCopy = Arrays.copyOf(largeArray, largeArray.length);
        Arrays.sort(largeArrayCopy);
        Quicksort.sort(largeArray);
        assertArrayEquals(largeArrayCopy, largeArray);
    }
}