package calclator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SakamotoCalc2 {
    public static void main(String[] args) {
        System.out.println("電卓ver.2.0へようこそ！" +
                "\r\n演算子は \"+\" \"-\" \"*\" \"/\" のうちのいずれかです。\r\n" +
                "\"C\" を入力すると計算結果を表示します。\r\n" +
                "それ以外は \"+\"　演算子として扱います。");//起動文
        // 各種宣言と初期化
        ArrayList<Integer> intAry = new ArrayList<>();
        ArrayList<String> strAry = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int cnt1 = 0;
        int i;
        int j;
        int ans = 0;
        String s;
        Calc1loop c = new Calc1loop();
        //処理部分
        try {
            do {
                intAry.add(sc.nextInt());
                strAry.add(sc.next());
                if (cnt1 == 0) {
                    ans = c.calc1loop(0, intAry.get(0), "+");
                } else {
                    i = ans;
                    j = intAry.get(cnt1);
                    s = strAry.get(cnt1 - 1);
                    ans = c.calc1loop(i, j, s);
                }
            } while (!strAry.get(cnt1++).equals("C"));//strAryに"C"が格納されたらループ終了
            //入力式表示部分
            System.out.print(intAry.get(0));
            int cnt2 = 1;
            for (; cnt2 < cnt1; cnt2++) {
                System.out.print(" " + strAry.get(cnt2 - 1) + " " + intAry.get(cnt2));
            }
            System.out.println();
            System.out.println("=");
            //計算結果表示
            System.out.println(ans);
        }catch (InputMismatchException e1){
            System.out.println("不正な値です。");//不正な文字の検出
        }catch (ArithmeticException e2){
            System.out.println("除数 \"0\" は定義されていません。");//除数0の検出
        }
    }
}
class Calc1loop{//入力された演算子に応じて計算を1回行うメソッド
    public int calc1loop(int i,int j,String s) {
        switch (s) {
            case "-":
                return i - j;
            case "*":
                return i * j;
            case "/":
                return i / j;
            case "C":
                return 0;
            default://"C"及び演算子以外は+として処理するように定義(誤魔化し)
                return i + j;
        }
    }
}