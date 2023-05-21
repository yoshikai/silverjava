package chap7.p316;

public class Main {
    public static void main(String[] args) {
        int[] num = {10, 20, 30};
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print("num :" + num[i]);
                System.out.println(" : " + (i + 1) + "回目のループ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("例外が発生しました。");
            } finally {
                System.out.println("-- finally");
            }
        }
        System.out.println("-- end --");
    }
}
