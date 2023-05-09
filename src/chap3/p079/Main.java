package chap3.p079;

public class Main {
    public static void main(String[] args) {
        String s = "abcdefa";
        System.out.println("charAt()      : " + s.charAt(2));
        System.out.println("indexOf()     : " + s.indexOf('c'));
        System.out.println("length()      : " + s.length());
        System.out.println("replace()     : " + s.replace('a', 'z'));
        System.out.println("substring()   : " + s.substring(2));
    }
}