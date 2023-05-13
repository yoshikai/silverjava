package mogi2.ex_17;

public class Main {
    public static void main(String[] args) {
        final int num = 10;
        int val = 20;
        int data = 30;
        switch (val) {
            case num:
                System.out.print("A ");
                break;
            case 10 * 2:
                System.out.print("B ");
                break;
//            case data:  //NGのためコメントアウト
//                System.out.print("C ");
//                break;
//            case "40"://NGのためコメントアウト
//                System.out.print("D ");
//                break;
        }
    }
}
