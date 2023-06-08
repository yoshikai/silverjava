package mogi1.temp.ex_71;

class ApplicationException extends Exception {
};

public class Main {
    public static void main(String[] args) {
        try {
            method();
        } catch (ApplicationException e) {
        }
    }

    static void method() throws ApplicationException {
        throw new ApplicationException();
    }
}
