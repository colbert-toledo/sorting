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

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
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
                    swap(array, j, i);
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        //For each element starting from the second one
        //(the first is considered ordered)
        for (int i = 1; i < array.length; i++) {
            //Grab the element to make a 'hole'
            int element = array[i];
            int j = i;
            //While we´re on the loop (j > 0) and the element is less than the element on its left
            while (j > 0 && element < array[j - 1]) {
                //move sorted elements to the right
                array[j] = array[j - 1];
                j--;
            }
            //Insert the element into the 'hole'
            array[j] = element;
        }
        return array;
    }

    public static int[] insertionSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j;
            for (j = i; j > 0 && tmp < array[j - 1]; j--)
                array[j] = array[j - 1];
            array[j] = tmp;
        }
        return array;
    }

    public static int[] insertionSort3(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        boolean swapped = true;
        int i = 0;
        while (swapped) {
            swapped = false;
            i++;
            //The last i elements are already sorted
            //Bubble largest elements to the end
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort2(int[] array) {
        boolean swapped = false;
        for (int element : array) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }

            //If there weren´t any swaps,
            if (!swapped) {
                // break early, its already sorted
                break;
            }
        }
        return array;
    }

    public static int[] bubbleSort3(int[] array) {
        int size = array.length;
        int newSize;

        do {
            newSize = 0;

            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    newSize = i;
                }
            }

            size = newSize;

        } while (size > 0);

        return array;
    }
}
