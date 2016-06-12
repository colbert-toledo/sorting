import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertArrayEquals(sorted, Sorter.selectionSort(unsorted));
        Assert.assertArrayEquals(sorted, Sorter.selectionSort2(unsorted));
    }

    @Test
    public void insertionSort() {
        Assert.assertArrayEquals(sorted, Sorter.insertionSort(unsorted));
        Assert.assertArrayEquals(sorted, Sorter.insertionSort2(unsorted));
        Assert.assertArrayEquals(sorted, Sorter.insertionSort3(unsorted));
    }
}