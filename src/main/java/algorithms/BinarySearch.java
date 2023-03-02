package algorithms;



public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(binarySearch(arr, 9));

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

class BinarySearchRecursive {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(binarySearchRecursive(arr, 0, 0, arr.length - 1));

    }

    public static int binarySearchRecursive(int[] arr, int searchNumber, int start, int end) {


        if (searchNumber < start || searchNumber > end) {
            System.out.print("NOT FOUND: ");
            return searchNumber;
        }

        int middle = (start + end) / 2;

        if (searchNumber == arr[middle]) return middle;

        if (searchNumber > arr[middle]) {

            return binarySearchRecursive(arr, searchNumber, middle + 1, end);
        }

        if (searchNumber < arr[middle]) {

            return binarySearchRecursive(arr, searchNumber, start, middle - 1);
        }

        return -1;
    }


}
