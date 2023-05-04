package chap7

public class Main {
    public static void main(String[] args) {
        int[] num = {10, 20, 30};
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print("num :" + num[i]);
                System.out.println(" : " + (i + 1) + "��ڂ̃��[�v");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("��O���������܂���");
            } finally {
                System.out.println("-- finally�̎��s");
            }
        }
        System.out.println("-- end --");
    }
}
