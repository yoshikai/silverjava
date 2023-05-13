package mogi2.ex_13;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("Blue");
        String str2 = "Blue";
        String str3 = str1.intern();

        System.out.print((str1 == str2) + " ");
        System.out.print((str1 == str3) + " ");
        System.out.println(str2 == str3);
    }
}
