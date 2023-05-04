package chap6.ex6

interface Test {
    default void a() {
    }

    public default void b() {
    }

    default void a(int a) {
    }

    public default void b(int b) {
    }

    static void c() {
    }
}