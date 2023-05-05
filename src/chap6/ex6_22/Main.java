package chap6.ex6_22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] ary1 = {"apple", "banana"};
        String[] ary2 = {"Apple", "Banana"};
        System.out.println(Arrays.mismatch(ary1, ary2));
    }
}
