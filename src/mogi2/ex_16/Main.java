package mogi2.ex

public class Main {
    public static void main(String[] args) {
        char val = 'a';
        switch (val) {
            case 'a':
                System.out.print("A ");
            case 'b':
                System.out.print("B ");
            case 'c' | 'd':
                System.out.print("C D ");
        }
    }
}
