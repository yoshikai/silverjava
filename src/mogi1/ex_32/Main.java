package mogi1.ex_32;

public class Main {
    public static void main(String[] args) {
        print(args);
    }

    static void print(String... data) {
        int i = 1;
        for (String s : data) {
            System.out.println((i++) + ") " + s);
        }
    }
}
