package mogi2.ex

public class Main {
    static int compute() {
        int num = 0;
        int sum = 0;
        while (num < 3) {
            sum += 1;
            num++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int ans = compute();
        ans = compute();
        System.out.println(compute());
    }
}
