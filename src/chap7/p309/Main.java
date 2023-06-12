package chap7.p309;

public class Main {
    public static void main(String[] args) {
        int[] num = {10, 20, 30};

        for (int i = 0; i < 4; i++) {
            System.out.print("num :" + num[i]);
            System.out.println(" : " + (i + 1) + "回目のループ");
        }
        System.out.println("-- end --");
    }
}
