public class Sorter {
    public static int[] selectionSort(int[] array) {
        //For each element in the array (except the last one)
        //The last one will be considered the biggest after all the iterations
        for (int i = 0; i < array.length - 1; i++) {
            //Find the min element in the unsorted a[i .. n-1]

            //Assume the min is the first element
            int min = i;

            //For each element in the rest of the array (i + 1) find the smallest
            for (int j = i + 1; j < array.length; j++) {
                //If the element is less than the current minimum
                if (array[j] < array[min]) {
                    //Set new minimum, remember its index
                    min = j;
                }

            }
            //If its not the same number
            if (min != i) {
                //Swap minimum element with first unsorted position
                swap(array, i, min);
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] selectionSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    swap(array, array[j], i);
                }
            }
        }
        return array;
    }
}
