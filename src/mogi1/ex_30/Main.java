package mogi1.ex

public class Main {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 1) {
                continue;
            }
            System.out.println(i);
        } while (i < 1);
    }
}