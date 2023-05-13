package mogi2.ex_8;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"A", null, "C"};
        int count = 0;
        for (String str : ary) {
            count += ary.length;
        }
        System.out.println(count);
    }
}
