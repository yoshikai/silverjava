package mogi2.ex

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"banana", "apple", "orange"};
        var list = Arrays.asList(ary);
        list.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(list);
    }
}