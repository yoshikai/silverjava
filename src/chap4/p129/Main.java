package chap4.p129;

public class Main {
    public static void main(String[] args) {
        // while の場合
        int count = 5;
        while (count != 5 && count > 0) {
            System.out.println("while    : count = " + count);
            count--;
        }
        // do-while の場合
        count = 5;
        do {
            System.out.println("do-while : count = " + count);
            count--;
        } while (count != 5 && count > 0);
    }
}
