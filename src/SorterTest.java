import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SorterTest {
    int[] unsorted;
    int[] sorted;

    @Before
    public void setUp() {
        unsorted = new int[]{2, 4, 6, 1, 3, 5, 8, 10, 9, 7};
        sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Test
    public void selectionSort() {
        assertArrayEquals(sorted, Sorter.selectionSort(unsorted));
        assertArrayEquals(sorted, Sorter.selectionSort2(unsorted));
    }

    @Test
    public void insertionSort() {
        assertArrayEquals(sorted, Sorter.insertionSort(unsorted));
        assertArrayEquals(sorted, Sorter.insertionSort2(unsorted));
        assertArrayEquals(sorted, Sorter.insertionSort3(unsorted));
    }

    @Test
    public void bubbleSort() {
        assertArrayEquals(sorted, Sorter.bubbleSort(unsorted));
        assertArrayEquals(sorted, Sorter.bubbleSort2(unsorted));
        assertArrayEquals(sorted, Sorter.bubbleSort3(unsorted));
    }
}