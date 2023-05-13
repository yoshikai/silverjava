package mogi2.ex_33;

public class Main {
    public static void main(String[] args) {
        for (String s : args) {
            switch (s) {
                case "one":
                    break;
                case "two":
                    continue;
            }
            System.out.print(s + " ");
        }
    }
}
