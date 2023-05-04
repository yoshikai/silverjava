package mogi1.ex

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = null;
        method(p1);
        System.out.println(p1);
        Person p2 = new Person("suzuki");
        method(p2);
        System.out.println(p2);
    }

    static Person method(Person obj) {
        if (obj == null) {
            return new Person("tanaka");
        } else {
            return null;
        }
    }
}
