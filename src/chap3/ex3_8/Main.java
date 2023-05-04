package chap3.ex3_8;

public class Main {
    public static void main(String[] args) {
        String str = "Orange";
        switch (str) {
            case "orange":
                System.out.println("Orange");
            case "apple":
                System.out.println("Apple");
                break;
            default:
                System.out.println("default");
        }
    }
}
