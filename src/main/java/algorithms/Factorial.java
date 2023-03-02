package algorithms;

public class Factorial {

    public static void main(String[] args) {

//        int s = factorialRecursive(0);
//        System.out.println(s);
        System.out.println(factorialNotRecursive(3));

    }

    public static int factorialRecursive(int n) {

        if (n == 1) return n;
        if (n < 1) throw new IllegalArgumentException("RONG ARG!");

        return n * factorialRecursive(n - 1);
    }

    public static int factorialNotRecursive(int n) {
        if (n == 1) return n;
        if (n < 1) throw new IllegalArgumentException("RONG ARG!");
        
        int res = 0;
        
        while (n != 1) {
            int s;
            s = n * (n--);
            res = s;
        }
        return res;
    }


}
