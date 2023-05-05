package chap6.ex6_21;

interface Foo {
    int bar(double d);
}

class FooImpl implements Foo {
    public int bar(double d) {
        return -1;
    }
}