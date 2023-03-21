public class BinarySearch {
    public static int search(int[] array, int searchedValue) {
        return searchRecursive(array, searchedValue, 0, array.length - 1);
    }

    private static int searchRecursive(int[] array, int searchedValue, int low, int high) {
        if (array == null || array.length == 0) return -1;

        // When the low is equal or higher then the high indicates this that there is no value like this.
        if (low > high) {
            return -1;
        }

        int mid = (high + low) >>> 1; // performs a bitwise right shift by one position, which is equivalent to a division by two
        int midValue = array[mid];

        if (midValue < searchedValue) {
            low = mid + 1;
        } else if (midValue > searchedValue) {
            high = mid - 1;
        } else {
            return mid;
        }

        return searchRecursive(array, searchedValue, low, high);
    }

    private static int searchIterativ(int array[], int searchedValue, int low, int high) {
        if(array == null || array.length == 0) {
            return -1;
        }

        while(low <= high) {
            int mid = (high + low) / 2;
            int midValue = array[mid];

            if(midValue < searchedValue) {
                low = mid + 1;
            } else if(midValue > searchedValue) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
