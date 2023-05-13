package mogi1.ex_52;

public interface Foo {
    public default int a() {
        return 0;
    }

//    private default void b() {  //NGのためコメントアウト
//    }

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
