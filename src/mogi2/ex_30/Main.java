package mogi2.ex

public class Main {
    public static void main(String[] args) {
        String[] ary = {"aa", "bb", "cc"};
        for (int i = 0; i < ary.length; i++) {
            switch (ary[i]) {
                case "aa":
                    System.out.println(ary[i]);
                    break;
                case "bb":
                    System.out.println(ary[i]);
                    i--;
                    break;
                case "cc":
                    System.out.println(ary[i]);
            }
        }
    }
}
