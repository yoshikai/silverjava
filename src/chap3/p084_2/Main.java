package chap3.p084_2;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = s2.intern();
        System.out.println("s1 == s2   : " + (s1 == s2));
        System.out.println("s1 == s3   : " + (s1 == s3));
        System.out.println("s1 == s4   : " + (s1 == s4));
        System.out.println("s2 == s4   : " + (s2 == s4));
    }
}
