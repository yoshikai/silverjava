package chap6.ex6

import java.util.Collection;
import java.util.List;
import java.util.Map;

class Parent {
    <T> Collection<T> foo(Collection c) {
        return null;
    }

    <T> List<T> foo(List c) {
        return null;
    }

    <T> List<T> foo(Collection c) {
        return null;
    }

    <T> Collection<T> foo(Map c) {
        return null;
    }
}
