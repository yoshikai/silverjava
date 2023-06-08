package mogi1.temp.ex_48;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 6, 9};
        int[] b = {2, 4, 6, 8, 9};
        System.out.print(Arrays.mismatch(a, b) + " ");
        System.out.println(Arrays.compare(a, b));
    }
}
