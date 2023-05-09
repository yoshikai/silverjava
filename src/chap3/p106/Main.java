package chap3.p106;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int a = 10;
        final int b = 20;
        switch (num) {
//            case a:   //コンパイルエラー
//                System.out.println("case a :の実行");
            case b:
                System.out.println("case b :の実行");
            case 30:
                System.out.println("case c :の実行");
        }

        String s1 = "A";
        final String s2 = "B";
        final String[] s3 = {"C"};
        switch ("X") {
//            case s1: //　コンパイルエラー
//                System.out.println("case s1   :の実行");
            case s2:
                System.out.println("case s2   :の実行");
//            case s3[0]:  //　コンパイルエラー
                System.out.println("case s3[0]:の実行");
        }
    }
}
