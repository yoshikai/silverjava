package calclator;

import java.util.Arrays;
import java.util.List;

public class CalclatorSample {
    public static void main(String[] args){

        //テスト用配列
        String[] ary = {"2","*","1", "+", "2", "*", "3", "-", "2"};
        String[] result = calcHighProcedenceOperator(ary);
        System.out.println(result[0]);
    }

    /**
     * 配列中の優先度が高い演算（乗算、除算）を行い、再帰処理にて配列の要素の乗算、除算、加算、減算を行うメソッド
     * @param formula 数式の文字列配列
     * @return String[] 全ての演算結果を算出した要素数１の文字列配列
     */
    private static String[] calcHighProcedenceOperator(String[] formula){
        List<String> ary = Arrays.asList(formula);
        String[] newAry = new String[formula.length -2];;
        int index = 0;
        String operator = null;
        if(ary.contains("*") || ary.contains("/")) {
            index = ary.indexOf("*") == -1 ? ary.indexOf("/") : ary.indexOf("*");
            operator = formula[index];
        }
        else{
            index = ary.indexOf("+") == -1 ? ary.indexOf("-") : ary.indexOf("+");
            operator = formula[index];
        }
        String left = formula[index - 1];   //左辺
        String right = formula[index + 1];  //右辺
        int l = Integer.parseInt(left);
        int r = Integer.parseInt(right);
        int result = calc(operator, l, r);
        for(int i=0,j=0; i<formula.length; i++){
            //iの値が左辺のインデックスと同じ場合は、計算結果を代入
            if(i == index -1){
                newAry[j] = String.valueOf(result);
                j++;
                continue;
            } else if (i == index || i == index +1) {
                continue;
            }
            newAry[j] = formula[i];
            j++;
        }
        if(newAry.length > 2){
            newAry = calcHighProcedenceOperator(newAry);
        }
        return newAry;
    }

    /**
     * Operator（演算子）に応じた四則演算を行うメソッド
     * @param operator
     * @param l 数式の演算子の左辺の値
     * @param r 数式の演算子の右辺の値
     * @return　operatorが*の場合は、l*r,/の場合はl/r,+の場合はl+r,-の場合はl-rの計算結果を返す。
     */
    private static int calc(String operator, int l, int r){
        if("*".equals(operator)){
            return l * r;
        }
        else if("/".equals(operator)){
           return l / r;
        } else if ("+".equals(operator)) {
            return l + r;
        }
        else{
            return l - r;
        }
    }
}
