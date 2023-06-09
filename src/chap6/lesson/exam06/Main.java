package chap6.lesson.exam06;

public class Main {
    int x;
    int y;
    void methodA(int x, int y) {
        x = x;
        y = y;
    }
    void methodB(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.methodA(10, 20);
        System.out.println("methodA: " + obj.x + " " + obj.y);
        obj.methodB(50, 60);
        System.out.println("methodB: " + obj.x + " " + obj.y);
    }
}