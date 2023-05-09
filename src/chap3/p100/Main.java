package chap3.p100;

public class Main {
    public static void main(String[] args) {
        int num = 20;
        String str = "numの値は";
        str += num < 10 ? "10未満" : "10以上";
        System.out.println(str);
    }
}
