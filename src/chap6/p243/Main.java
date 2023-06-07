package chap6.p243;

public class Main {
}

class Animal {
    void eat(){System.out.println("食べる");}
    void sleep(){System.out.println("寝る");}
    void walk(){System.out.println("歩く");}
}
class Human extends Animal{
    void eat(){System.out.println("美味しいご飯を食べる");}
    void walk(){System.out.println("時速４Kmで歩く");}
}
interface Bark{
    void bark();
}
class Dog extends Animal implements Bark{

    @Override
    public void bark() {
        System.out.println("わんわん");
    }
}