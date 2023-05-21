package chap7.p321;

class Test {
    void loop() throws ArrayIndexOutOfBoundsException {
        int[] num = {10, 20, 30};
        for (int i = 0; i < 4; i++) {
            System.out.println("num :" + num[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            Test t = new Test();
            t.loop();
        } catch (ArrayIndexOutOfBoundsException e) {
            //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/ArrayIndexOutOfBoundsException.html
            System.out.println("例外が発生しました");
        }
        System.out.println("-- end --");
    }
}
