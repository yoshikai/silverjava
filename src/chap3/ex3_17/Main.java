package chap3.ex3_17;

public class Main {
    public static void main(String[] args) {
        String str = "12345";
        str += 6789;
//        str -= 6789;  //NG
        str += 0;
        System.out.println("str : " + str);
    }
}
