package chap6.ex6

class Animal {
    void saySomething() {
        System.out.print("Gurrr! ");
    }
}

public class Cow extends Animal {
    protected void saySomething() {
        System.out.print("Moo! ");
    }

    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Cow()};
        for (Animal a : animals) {
            a.saySomething();
        }
    }
}
