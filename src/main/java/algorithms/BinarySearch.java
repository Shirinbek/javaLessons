package algorithms;



public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(binarySearch(arr, -1));

    }

    public static int binarySearch(int[] arr, int n) {

        int low = 0;

        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == n) return mid;
            if (guess > n) {
                high = mid -1;
            }else {low = mid + 1;}
        }
        System.out.print("Not found: ");
        return n;
    }
}
