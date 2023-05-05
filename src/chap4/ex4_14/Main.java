package chap4.ex4_14;

public class Main {
    public static void main(String[] args) {
        String[] ary1 = new String[2];
        String[] ary2 = {new String("A"), "B"};
        for (String s : ary1) {
            System.out.print(s + " ");
        }
        for (String s : ary2) {
            System.out.print(s + " ");
        }
    }
}
