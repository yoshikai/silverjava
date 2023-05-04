package mogi1.ex

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("World");
        sb.insert(6, " ");
        System.out.println(sb.toString().replace('o', 'e'));
    }
}
