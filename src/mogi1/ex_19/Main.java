package mogi1.ex_19;

public class Main {
    public static void main(String[] args) {
        String s = "this is no";
        int i = s.indexOf("is");
        s.substring(i);
        i = s.indexOf("is");
        System.out.println(s + i);
    }
}
