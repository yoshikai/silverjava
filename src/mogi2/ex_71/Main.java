package mogi2.ex

public class Main {
    public static void main(String[] args) {
        try {
            method();
            System.out.print("A ");
        } catch (IllegalArgumentException e) {
            System.out.print("B ");
        } catch (Exception e) {
            System.out.print("C ");
        } finally {
            System.out.print("D ");
        }

    }

    static void method() {
        throw new IllegalArgumentException();
    }
}
