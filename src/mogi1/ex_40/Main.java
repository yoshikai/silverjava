package mogi1.ex

class Main {
    void print(int i) {
        System.out.println("A");
    }

    void print(long l) {
        System.out.println("B");
    }

    void print(String s) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Main().print(0B0000_0000_0000_0110);
    }
}