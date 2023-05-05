package chap5.ex5_4;

public class Main {
    void x(int num) {
        num += 30;
    }

    public static void main(String[] args) {
        int num = 10;
        Main obj = new Main();
        obj.x(num);
        System.out.println(num);
    }
}
