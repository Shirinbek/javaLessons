package algorithms;

public class Fibonacci {
    public static void main(String[] args) {

       System.out.println(fibEffective(5));
       naivFibonacci(3);

    }

    public static long naivFibonacci(int number) {
        if (number <= 1)
            return number;
        return naivFibonacci(number - 1) + naivFibonacci(number-2);
    }

    public static long fibEffective(int n) {
         long[] arr = new long[n + 1];
         arr[0] = 0;
         arr[1] = 1;
         for (int i = 2; i <= n; i++) {
             arr[i] = arr[i - 1] + arr[i - 2];
         }
         return  arr[n];
    }
}
