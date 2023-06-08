package chap6.p243;

public class Main {
    public static void main(String[] args){
        Animal ani = new Dog();   //サブクラスを返す何かしらのメソッド

        Bark b1 = getBarkConcreteClass();
        b1.bark();

    }

    static Bark getBarkConcreteClass(){
        return new Wolf();
    }
}

class Animal {
    void eat(){System.out.println("食べる");}
    void sleep(){System.out.println("寝る");}
    void walk(){System.out.println("歩く");}
}
class Human extends Animal{
    @Override
    void eat(){System.out.println("美味しいご飯を食べる");}
    @Override
    void walk(){System.out.println("時速４Kmで歩く");}

    /**
     * 新規追加メソッド
     */
    void talk(){System.out.println("会話する");}
}
interface Bark{
    void bark();
}
interface Riderable{
    void ride(Human h);
}
class Dog extends Animal implements Bark{
    @Override
    public void bark() {
        System.out.println("わんわん");
    }
}

class Wolf implements Bark{
    @Override
    public void bark() {System.out.println("わおーん");}
}