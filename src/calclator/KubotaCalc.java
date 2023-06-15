package calclator;
import java.util.*;
public class KubotaCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("左辺の一桁の数値を入力");
        int x = sc.nextInt();
        System.out.println("+か-を入力");
        String operator = sc.next();
        System.out.println("右辺の一桁の数値を入力");
        int y = sc.nextInt();
        int a = calc(x,operator,y);
        System.out.println(a);
    }
    static int calc(int x, String operator, int y){
        if(operator.equals("+")){
            int a = x + y;
            return a;
        }else{
            int a = x + y;
            return a;
        }
    }
}
