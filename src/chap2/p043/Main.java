package chap2.p043;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;  //OK
        num1 = 20;      //OK
        final int num2 = 10;   //OK
//        num2 = 20;      //NG
    }
}
