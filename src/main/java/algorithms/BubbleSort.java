package algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] index = new int[]{7, 6, 5, 4, 3, 2, 1};
        bubbleSort(index);
    }

    public static void bubbleSort(int[] arr) {
        int tmp;
        boolean statusSort = false;
        int c = 0;
        while (!statusSort) {
            c++;
            statusSort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    statusSort = false;
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;

                }
            }
            System.out.println(c + " ----- " + "Отсортированный массив: " + Arrays.toString(arr));
        }

    }
}
