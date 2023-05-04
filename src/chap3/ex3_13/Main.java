package chap3.ex3_13;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = "Java";
        String str3 = str1.intern();
        System.out.print((str1 == str2) + " ");
        System.out.print((str1 == str3) + " ");
        System.out.print((str2 == str3));
    }
}
