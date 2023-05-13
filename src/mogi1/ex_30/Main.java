package mogi1.ex_30;

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