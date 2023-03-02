package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLisT {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("test");
        for (int i = 0; i < 5; i++) arr.add(i);
        arr.remove(2);
        System.out.println(arr);
    }
}
