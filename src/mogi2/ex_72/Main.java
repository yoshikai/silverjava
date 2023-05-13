package mogi2.ex_72;

public class Main {
    private int num = 100, div = 0;

    public void divide() {
        try {
            num = num / div;
        } catch (ArithmeticException ae) {
            num = -1;
        } catch (Exception e) {
            num = -2;
        } finally {
            System.out.print(num);
        }
    }

//    public static void main(String[] args) {
//        new mogi2.ex_78.my.exam.Main().divide();
//    }   //NGのためコメントアウト
}
