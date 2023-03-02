package algorithms;

import java.util.Arrays;

public class OwnSort {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 2, 3, 4, 6};

        test(arr);

    }

    public static void test(int[] arr) {
        int tmp;
        boolean j = false;
        int c = 0;
        while (!j) {
            j = true;
            c++;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    j = false;
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }

            }

            System.out.println(c + " ----- " + "Отсортированный массив: " + Arrays.toString(arr));

        }
    }


}
