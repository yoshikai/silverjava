package mogi1.temp.ex_49;

import java.util.Collection;

class Parent {
    <T> Collection<T> foo(Collection<T> c) {
        return null;
    }
}

class Child extends Parent {
    //[ 1 ]
}
