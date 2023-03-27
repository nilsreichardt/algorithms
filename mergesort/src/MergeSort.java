import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort {
    public static void sort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;
        }

        int leftSize = length / 2;
        int[] left = IntStream.range(0, leftSize).map(i -> array[i]).toArray();
        int[] right = IntStream.range(leftSize, length).map(i -> array[i]).toArray();

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private static void merge(int[] input, int[] left, int[] right) {
        int leftPointer = 0;
        int rightPointer = 0;
        int inputPointer = 0;

        // As long as there are still ints in BOTH arrays, do merging.
        while (leftPointer < left.length && rightPointer < right.length) {
            if (left[leftPointer] < right[rightPointer]) {
                input[inputPointer++] = left[leftPointer++];
            } else {
                input[inputPointer++] = right[rightPointer++];
            }
        }

        // When reached here, either left, right or both sides are finished.
        //
        // So we are checking if there are still ints on the left side. If yes,
        // just add them all.
        while (leftPointer < left.length) {
            input[inputPointer++] = left[leftPointer++];
        }

        // Now checking if there are still element in the right side.
        // If yes, just add them all.
        while (rightPointer < right.length) {
            input[inputPointer++] = right[rightPointer++];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MergeSort.sort(array);
    }
}
