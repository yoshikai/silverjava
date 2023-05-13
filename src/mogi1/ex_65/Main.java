package mogi1.ex_65;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of();
        list.add(0, 1);
        list.add(0, -1);
        list.add(0, 3);
        System.out.println(list);
    }
}
