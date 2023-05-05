package chap6.ex6_16;

class Animal {
    public static void saySomething() {
        System.out.print("Gurrr! ");
    }
}

public class Cow extends Animal {
    public static void saySomething() {
        System.out.print("Moo! ");
    }

    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Cow()};
        for (Animal a : animals) {
            a.saySomething();
        }
    }
}
