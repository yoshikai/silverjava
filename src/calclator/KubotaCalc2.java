package calclator;

import java.util.Scanner;

public class KubotaCalc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 ;
        int a2 ;
        while( true) {
            try {
                System.out.println("左辺の数値を入力");
                String x = sc.next();
                if (x.equals("C")) //Cを入力するとループから抜ける
                    break;
                int num1 = Integer.parseInt(x); //文字列を数値に変換
                System.out.println("次の演算子を入力 + - * / ");
                String operator = sc.next();
                if (operator.equals("C"))
                    break;
                System.out.println("数値を入力");
                String y = sc.next();
                if (y.equals("C"))
                    break;
                int num2 = Integer.parseInt(y);
                System.out.println("演算子を代入　計算するなら=を入力");
                String answerOrCalc = sc.next();
                if (answerOrCalc.equals("=")) { //=を入力するとcalcメソッドを呼び出す
                    a1 = calc(operator, num1, num2);
                    if(a1 == 0) {
                        System.out.println("正しい値を入力してください");
                        continue;
                    }
                    System.out.println(a1);
                }else{
                    System.out.println("数値を代入");
                    String z = sc.next();
                    int num3 = Integer.parseInt(z);
                    a2 = calc2(num1,num2,num3,operator,answerOrCalc); //calc2メソッドの呼びだし
                    if(a2 == 0) {
                        System.out.println("正しい値を入力してください");
                        continue;
                    }
                    System.out.println(a2);
                }
            }catch (ArithmeticException e){ //不正な入力をしエラーが上がった際のエラー？
                System.out.println("正確な数値を入力してください");
            }
        }
    }
    static int calc(String operator,int x,  int y){
        if(operator.equals("+")){
            return x + y;
        }
        if(operator.equals("-")){
            return x - y;
        }
        if(operator.equals("*")){
            return x * y;
        }if(operator.equals("/")) {
            return x / y;
        }else{
            return 0;
        }
    }
    static int calc2(int x, int y, int z, String operator1, String operator2){
        if(operator1.equals("+")){
            if(operator2.equals("+")){
                return x + y + z;
            }
            if(operator2.equals("-")){
                return x + y -z;
            }
            if(operator2.equals("*")){
                return x + y * z;
            }
            if(operator2.equals("/")){
                return x + y / z;
            }
        }
        if(operator1.equals("-")){
            if(operator2.equals("+")){
                return x - y + z;
            }
            if(operator2.equals("-")){
                return x - y -z;
            }
            if(operator2.equals("*")){
                return x - y * z;
            }
            if(operator2.equals("/")){
                return x - y / z;
            }
        }
        if(operator1.equals("*")){
            if(operator2.equals("+")){
                return x * y + z;
            }
            if(operator2.equals("-")){
                return x * y -z;
            }
            if(operator2.equals("*")){
                return x * y * z;
            }
            if(operator2.equals("/")){
                return x * y / z;
            }
        }
        if(operator1.equals("/")){
            if(operator2.equals("+")){
                return x / y + z;
            }
            if(operator2.equals("-")){
                return x / y -z;
            }
            if(operator2.equals("*")){
                return x / y * z;
            }
            if(operator2.equals("/")){
                return x / y / z;
            }
        }
        return 0;
    }
}
