package chap4.ex4

public class Main {
    public static void main(String[] arg) {
        int i = 2;
        Outer:
        if (i < 5) {
            System.out.println("i: " + i);
            i++;
            continue Outer;
        }
    }
}
