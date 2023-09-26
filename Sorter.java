import java.util.Arrays;

public class Sorter {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    public static void insertionSort(int[] array) {
        for (int k = 1; k < array.length; k++) {
            int temp = array[k];
            int j = k - 1;
            while (j >= 0 && temp <= array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    public static void sort(int[] array) {
        insertionSort(array);
    }
    public static void sort2(int[] array) {
        selectionSort(array);
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 7, 2, 8, 4 };
        sort(array);
        System.out.println("Sorted array using insertionSort sort: " + Arrays.toString(array));
        sort2(array);
        System.out.println("Sorted array using selection sort: " + Arrays.toString(array));
    }
}
