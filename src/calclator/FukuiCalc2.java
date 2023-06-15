package calclator;

import java.util.Scanner;

public class FukuiCalc2 {
    public static void main(String[] args) {
        for (;;) {
            Scanner scan = new Scanner(System.in);
            System.out.println("終了する場合はshift+cを押して下さい。");
            System.out.println("続行する場合は他のキーを押して下さい。");
            String end = scan.nextLine();
            if (end.equals("C")) {
                break;
            }
            System.out.println("何個の数値を入力しますか？");
            int count = scan.nextInt();
            int ans = 0;
            System.out.println("数値1を入力して下さい。");
            int num1 = scan.nextInt();
            for (int i = 1; i < count; i++) {
                System.out.println("演算子を入力してください");
                String str = scan.next();
                System.out.println("数値" + (i+1) + "を入力して下さい。");
                int num2 = scan.nextInt();
                if (str.equals("+")) {
                    num1 = num1+num2;
                } else if (str.equals("-")) {
                    num1 = num1-num2;
                } else if (str.equals("*")) {
                    num1 = num1 * num2;
                } else if (str.equals("/")) {
                    num1 = num1 / num2;
                }
            }
            System.out.println("計"+num1);
        }
    }
}
