package chap4

public class Main {
    public static void main(String[] args) {
        loop1:
        // ���x��loop1���w��
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("x = " + x + " y = " + y);
                if (x == 1 && y == 1) {
                    System.out.println("break���̎��s");
                    break loop1;  // ���x��loop1��break
                }
            }
        }
        System.out.println("------------------------------");
        loop2:
        // ���x��loop2���w��
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("x = " + x + " y = " + y);
                if (x == 1 && y == 1) {
                    System.out.println("continue���̎��s");
                    continue loop2;  // ���x��loop2��continue
                }
            }
        }
    }
}
