import org.junit.Assert;
import org.junit.Test;

public class SorterTest {
    @Test
    public void selectionSort() {
        int[] array = {2, 4, 6, 1, 3, 5};
        int[] sorted = {1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(sorted, Sorter.selectionSort(array));
    }

    @Test
    public void selectionSort2() {
        int[] array = {2, 4, 6, 1, 3, 5};
        int[] sorted = {1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(sorted, Sorter.selectionSort2(array));
    }
}