package chap5.ex5_3;

public class Main {
    int x = 3;
    static int y = 2;

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        Main obj = new Main();
        obj.printIt();
        obj.printIt(y);
    }

    Main() {
        x = x + 1;
    }

    static {
        y += y;
    }

    void printIt() {
        System.out.print(++x);
    }

    void printIt(int y) {
        System.out.print(" " + ++y);
    }
}
