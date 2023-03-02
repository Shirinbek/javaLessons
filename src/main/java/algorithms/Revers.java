package algorithms;

import java.util.Arrays;

public class Revers {

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        revers(s);

    }

    public static void revers(char[] s) {
        int j = s.length -1;
        for (int i = 0; i < j; i++) {
            char test = s[i];
            s[i] = s[j];
            s[j] = test;
            j--;
        }
    }


}
