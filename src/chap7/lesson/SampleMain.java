package chap7.lesson;

public class SampleMain {
    public static void main(String[] args) throws Exception {
        x();
        System.out.print("1 ");
    }
    static void x() throws Exception {
        y();
        System.out.print("2 ");
    }
    static void y() throws Exception {
        throw new Exception();
    }
}
