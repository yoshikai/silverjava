package chap5.ex5_15;

public class Main {
    static int x = 1;
    int y = 1;

    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main();
        obj1.x = 5;
        obj1.y = 6;
        obj2.x = 7;
        obj2.y = 8;
        System.out.println("ans:" + obj1.x + obj1.y + obj2.x + obj2.y);
    }
}
