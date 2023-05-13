package mogi2.ex_22;

public class Main {
    public static void main(String[] args) {
        var sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.insert(1, "x");
        sb.append(234);
        sb.delete(1, 2);
        System.out.println(sb);
    }
}
