package chap3.ex3_12;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = str1;
        if (str1 == str2) System.out.println("==");
        if (str1.equals(str2)) System.out.println("equals");
    }
}
