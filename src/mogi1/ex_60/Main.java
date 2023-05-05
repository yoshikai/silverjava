package mogi1.ex

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> odd =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        odd.removeIf(i -> i % 2 == 0);
        System.out.println(odd);
    }
}
