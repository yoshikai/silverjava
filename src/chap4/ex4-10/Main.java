package chap4.ex4

public class Main {
    public static void main(String[] args) {
        String[] ary = {"Orange", "Apple", "Banana"};
        for (String str : ary) {
            switch (str) {
                case "Orange":
                    System.out.print("Orange ");
                case "Apple":
                    System.out.print("Apple ");
                    break;
                default:
                    System.out.print("other ");
            }
        }
    }
}
