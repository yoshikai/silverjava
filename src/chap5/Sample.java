package chap5;

public class Sample {
    /**
     * A. data2 + " " + num1
     * B. new Main().data2 + " " + new Main().num1
     * C. Main.data2 + " " + Main.num1
     * D. Main.data2 + " " + New Main().num1
     * E. data2 + " " + new Main().num1
     */
    int num1 = 100;
    static String data2 = "hello";
    public static void main(String[] args) {
        System.out.println(data2 + " " + new Sample().num1);
    }
}
