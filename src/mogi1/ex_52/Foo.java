package mogi1.ex

public interface Foo {
    public default int a() {
        return 0;
    }

    private default void b() {
    }

    public default int c(int num) {
        return 0;
    }

    default void d(int num) {
    }

    private static void e() {
    }

    static void f() {
    }
}
