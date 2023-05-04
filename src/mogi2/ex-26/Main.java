package mogi2.ex

public class Main {
    public static void main(String[] args) {
        int i = 0;
        switch (args[0]) {
            case "a":
                i++;
            case "b":
                i++;
            case "c" | "d":
                i++;
            case "e":
                i++;
                break;
            default:
                i++;
                break;
        }
        System.out.print(args[0] + " " + i);
    }
}
