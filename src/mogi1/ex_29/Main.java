package mogi1.ex_29;

public class Main {
    public static void main(String[] args) {
        System.out.print("Java" + (0 / 5));
        for (int i = 0; i < 10; i++) {
            switch (i % 5) {
                case 0:
                    break;
                case 1:
                    i += 3;
                    break;
                case 2:
                    i *= 2;
                    break;
                default:
                    continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
