package chap3.p086;

public class Main {
    public static void main(String[] args) {
        String s1 = "X";
        String s2 = s1 + "Y";
        System.out.println("s1 == s2   : " + (s1 == s2));

        String s3 = "X";
        String s4 = s3.concat("Y");
        System.out.println("s3 == s4   : " + (s3 == s4));
        System.out.println("s3.equals(s4)   : " + (s3.equals(s4)));

        StringBuilder s5 = new StringBuilder("X");
        StringBuilder s6 = s5.append("Y");
        s5.append("z").reverse();
        System.out.println("s5 == s6   : " + (s5 == s6));
        System.out.println("s5.equals(s6)   : " + (s5.equals(s6)));

    }
}
