package chap4.ex4

public class Main {
    public static void main(String[] args) {
        int[][] ary = {{1, 2}, {3, 4}};
        for (int x = 0; x < ary.length; x++) {
            for (int y = 0; y < ary.length; y++) {
                // �����ɃR�[�h��}��
                System.out.print(ary[x][y] + " ");
            }
        }
    }
}
