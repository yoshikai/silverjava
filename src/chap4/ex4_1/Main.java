package chap4.ex4_1;

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
