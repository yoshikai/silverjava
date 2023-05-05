package chap7.ex7_16;

class MyException extends RuntimeException {
}

public class Main {
    static void bar() {
        foo();
    }

    static void foo() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            foo();
            System.out.println("B");
        } catch (MyException e) {
            bar();
        } catch (RuntimeException e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
    }
}
