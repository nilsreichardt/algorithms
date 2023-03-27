import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void testEmptyArray() {
        int[] array = {};
        int[] expected = {};
        MergeSort.sort(array);
        assertArrayEquals(expected, array, "The sorted array should be empty");
    }

    @Test
    public void testSingleElementArray() {
        int[] array = {5};
        int[] expected = {5};
        MergeSort.sort(array);
        assertArrayEquals(expected, array, "The sorted array should have a single element");
    }

    @Test
    public void testTwoElementArray() {
        int[] array = {9, 3};
        int[] expected = {3, 9};
        MergeSort.sort(array);
        assertArrayEquals(expected, array, "The sorted array should have two elements in ascending order");
    }

    @Test
    public void testSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSort.sort(array);
        assertArrayEquals(expected, array, "The sorted array should be the same as the input array");
    }

    @Test
    public void testReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSort.sort(array);
        assertArrayEquals(expected, array, "The sorted array should be the reverse of the input array");
    }

    @Test
    public void testRandomArray() {
        int[] array = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSort.sort(array);
        assertArrayEquals(expected, array, "The sorted array should be in ascending order");
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] array = {5, 3, 2, 3, 5};
        int[] expected = {2, 3, 3, 5, 5};
        MergeSort.sort(array);
        assertArrayEquals(expected, array, "The sorted array should be in ascending order with duplicates");
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] array = {-5, -3, 2, 0, 5};
        int[] expected = {-5, -3, 0, 2, 5};
        MergeSort.sort(array);
        assertArrayEquals(expected, array, "The sorted array should be in ascending order with negative numbers");
    }
}