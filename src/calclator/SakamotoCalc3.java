package calclator;
import java.util.*;
public class SakamotoCalc3 {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator 2.0!\r\n" +
                "The operator is one of \" +\" \" -\" \" *\" \" / \".\r\n" +
                "Enter \"=\" to display the final calculation result.\r\n" +
                "Type \"end\" to end the program.");//起動文
        // 各種宣言
        ArrayList<Integer> intAry = new ArrayList<>();
        ArrayList<String> strAry = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Calcloop c = new Calcloop();
        String scanStr = "";
        String[] opr = {"+","-","*","/","="};
        List<String> oprList = Arrays.asList(opr);
        while (!scanStr.equals("end")) {
            System.out.println();
            System.out.println("↓　↓　↓　Please enter an expression.　↓　↓　↓");
            intAry.clear();//"="で結果出力後の変数初期化とリストのクリア
            strAry.clear();
            int cnt1 = 0;
            int cnt2 = 0;
            int ans = 0;
            scanStr = "";
            try {
                while (!scanStr.equals("=")) {
                    scanStr = sc.next();
                    if (scanStr.equals("end")) {//"end"の検知
                        break;
                    } else if (cnt1 % 2 == 0) {//int型として受け取り
                        intAry.add((Integer.parseInt(scanStr)));
                        if (cnt1 == 2) {//計算部分
                            ans = c.calc1loop(intAry.get(0), intAry.get(1), strAry.get(0));
                            System.out.println(" = " + ans+ "   |||Enter \"=\" to confirm the result.|||");
                        } else if (cnt1 > 2) {//計算部分（3項以上の条件対応）
                            ans = c.calc1loop(ans, intAry.get(cnt1 / 2), strAry.get(cnt1 / 2 - 1));
                            System.out.println(" = " + ans+ "  |||Enter \"=\" to confirm the result.|||");//途中結果の表示
                        }
                    } else if (cnt1 % 2 == 1) {//演算子をString型で受け取り
                        strAry.add(scanStr);
                        if (!oprList.contains(scanStr)) {//演算子リストoprListと比較し正しい演算子かチェック
                            System.out.println("operator is different.");
                            break; //修正箇所です。
                        } else if (scanStr.equals("=")) {//"="を受け取った場合の結果出力
                            System.out.println("final result");
                            System.out.print(intAry.get(0) + " " + strAry.get(0) + " ");
                            for (; cnt2 < cnt1 / 2; cnt2++) {
                                System.out.print(intAry.get(cnt2 + 1) + " " + strAry.get(cnt2 + 1) + " ");
                            }
                            System.out.println();
                            System.out.println(ans);
                        }
                    }
                    cnt1++;
                }
            }catch (ArithmeticException e1){
                System.out.println("Divisor \"0\" is undefined.");
            }catch (NumberFormatException e2){
                System.out.println("Illegal value");
            }
        }
        System.out.println();
        System.out.println("---　EXIT ---");
    }
}
class Calcloop{//入力された演算子に応じて計算を1回行うメソッド
    public int calc1loop(int i,int j,String s) {
        switch (s) {
            case "+":
                return i + j;
            case "-":
                return i - j;
            case "*":
                return i * j;
            case "/":
                return i / j;
            default:
                return 0;
        }
    }
}
