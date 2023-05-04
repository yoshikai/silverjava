package mogi2.ex

public class Main {
    public static void main(String[] args) {
        String cards = new String("DHCS");
        switch (cards.substring(1, 2)) {
            case "D":
                System.out.print("Diamonds ");
                break;
            case "H":
                System.out.print("Hearts ");
            case "C":
                System.out.print("Clubs ");
                break;
            case "S":
                System.out.print("Spades ");
            default:
                System.out.println("default");
        }
    }
}
