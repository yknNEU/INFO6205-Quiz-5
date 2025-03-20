import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void testSelectionSortWithUnsortedArray() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithDuplicateElements() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithSingleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortWithNegativeNumbers() {
        int[] arr = {-3, -1, -4, -1, -5, -9, -2, -6, -5};
        int[] expected = {-9, -6, -5, -5, -4, -3, -2, -1, -1};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }
}
