package calclator;

import java.util.Scanner;
class Operator{
    public int calcPlus(int i,int j) {
        return i + j;
    }
    public int calcMinus(int i,int j){
        return i - j;
    }
    public int calcMulti(int i,int j){
        return i*j;
    }
    public int calcDiv(int i,int j){
        return i/j;
    }
}
public class SakamotoCalc {
    public static void main(String[] args) throws Exception {
        System.out.println("次の形式に沿って入力してください\r\n" +
                "2つの数字をint i, int l\r\n" +
                "演算子 s を\r\n" +
                "足し算 : +\r\n" +
                "引き算 : -\r\n" +
                "掛け算 : *\r\n" +
                "割り算 : /\r\n" +
                "とした時\r\n" +
                "i s l\r\n" +
                "の形で入力してください↓");
        Operator operator = new Operator();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String opr = sc.next();
        int j = sc.nextInt();
        try {
            switch (opr) {
                case "+":
                    System.out.println(i + " + " + j + " = " + operator.calcPlus(i, j));
                    break;
                case "-":
                    System.out.println(i + " - " + j + " = " + operator.calcMinus(i, j));
                    break;
                case "*":
                    System.out.println(i + " * " + j + " = " + operator.calcMulti(i, j));
                    break;
                case "/":
                    System.out.println(i + " / " + j + " = " + operator.calcDiv(i, j));
                    break;
                default:
                    System.out.println("演算子が無効です");
            }
        } catch (Exception e) {
            System.out.println("不正な値です。");
        }
    }
}