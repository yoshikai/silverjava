package chap6.ex6

interface Foo {
    int bar(double d);
}

class FooImpl implements Foo {
    public int bar(double d) {
        return -1;
    }
}