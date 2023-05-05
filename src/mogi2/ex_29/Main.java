package mogi2.ex

public class Main {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = s1.concat("BC");
        s1 = null;
        String s3 = s2.replace('C', 'D');
        String s4 = s3.concat("E");
        System.out.println(s1 + " " + s4);
    }
}
