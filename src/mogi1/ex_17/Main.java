package mogi1.ex

public class Main {
    public static void main(String[] args) {
        String s1 = "MON";
        String[] s2 = {"TUE"};
        final String s3 = "FRI";
        switch (s2[0]) {
            case s1:
                System.out.print("Monday ");
            case "TUE":
                System.out.print("Tuesday ");
            case s3:
                System.out.print("Friday ");
        }
    }
}
