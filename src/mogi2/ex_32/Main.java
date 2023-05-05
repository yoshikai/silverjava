package mogi2.ex

public class Main {
    public static void main(String[] args) {
        int x = 0;
        do {
            switch (x) {
                case 0:
                    continue;
                case 1:
                    break;
                default:
            }
            System.out.print(x);
        } while (x++ < 2);
    }
}
