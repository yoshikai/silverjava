package chap7.ex7_12;

public class Main {
    private short s;
    private Integer i;

    public Main(int i) {
        this.i = this.i + i + s;
        this.s = 0;
    }

    public void print() {
        System.out.println(" s = " + s + " : i = " + i);
    }

    public static void main(String[] args) {
        Main obj = new Main(5);
        obj.print();
    }
}
