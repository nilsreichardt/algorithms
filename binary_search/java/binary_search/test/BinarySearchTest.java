import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testEmptyArray() {
        int[] array = new int[]{};
        int searchedValue = 3;
        int result = BinarySearch.search(array, searchedValue);
        assertEquals(-1, result);
    }

    @Test
    public void testSingleElementArray() {
        int[] array = new int[]{5};
        int searchedValue = 5;
        int result = BinarySearch.search(array, searchedValue);
        assertEquals(0, result);
    }

    @Test
    public void testSingleElementArrayNotFound() {
        int[] array = new int[]{5};
        int searchedValue = 3;
        int result = BinarySearch.search(array, searchedValue);
        assertEquals(-1, result);
    }

    @Test
    public void testMultipleElementsArrayValueFound() {
        int[] array = new int[]{-4, 0, 2, 5, 7, 10, 15};
        int searchedValue = 7;
        int result = BinarySearch.search(array, searchedValue);
        assertEquals(4, result);
    }

    @Test
    public void testMultipleElementsArrayValueNotFound() {
        int[] array = new int[]{-4, 0, 2, 5, 7, 10, 15};
        int searchedValue = 8;
        int result = BinarySearch.search(array, searchedValue);
        assertEquals(-1, result);
    }

    @Test
    public void testMultipleElementsArrayWithDuplicates() {
        int[] array = new int[]{-5, -3, 0, 0, 3, 3, 3, 8, 12};
        int searchedValue = 3;
        int result = BinarySearch.search(array, searchedValue);
        assertEquals(4, result);
    }

    @Test
    public void testMultipleElementsArrayWithNegativeNumbers() {
        int[] array = new int[]{-15, -10, -8, -5, -3, -1, 0, 2, 4, 6};
        int searchedValue = -8;
        int result = BinarySearch.search(array, searchedValue);
        assertEquals(2, result);
    }

    @Test
    public void testMultipleElementsArrayValueFirstPosition() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int searchedValue = 1;
        int result = BinarySearch.search(array, searchedValue);
        assertEquals(0, result);
    }
}