public class Quicksort {
    public static void main(String[] args) {
        // Wir nehemn ein Pivot Element, z.B. das letzte Element.
        // Nun nehmen wir die links Seite von dem Array
        
    }
    
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
    
    public static void sort(int[] array, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer) {
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);

        sort(array, lowIndex, leftPointer - 1);
        sort(array, leftPointer + 1, highIndex);
    }

    private static void swap(int[] input, int leftIndex, int rightIndex) {
        int temp = input[leftIndex];
        input[leftIndex] = input[rightIndex];
        input[rightIndex] = temp;
    }
}
