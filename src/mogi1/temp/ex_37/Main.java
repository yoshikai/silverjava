package mogi1.temp.ex_37;

import java.util.List;

public class Main {
    static void print(Integer data) {
        System.out.println("A");
    }

    static void print(List<Integer> data) {
        System.out.println("B");
    }

    static void print(String... data) {
        System.out.println("C");
    }

    static void print(String data) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        print(args);
    }
}
