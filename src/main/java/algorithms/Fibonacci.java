package algorithms;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {

        int number = 45;

        long[] mem = new long[number + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibNaiveEffective(number, mem));
        System.out.println(fibEffective(number));
        System.out.println(fibNaive(number));

    }

    public static long fibNaive(int n) {
        if (n <= 1)
            return n;
        return fibNaive(n - 1) + fibNaive(n-2);
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

    public static long fibNaiveEffective(int n, long[] mem) {
        if (mem[n] != -1) return mem[n];
        if (n <= 1) return n;

        long result =  fibNaiveEffective(n -1, mem) + fibNaiveEffective(n - 2, mem);
        mem[n] = result;

        return result;

    }
}
