package chap6.p243;

public class Main {
    public static void main(String[] args){
        Animal ani = new Dog();   //サブクラスを返す何かしらのメソッド
        Bark b1 = getBarkConcreteClass(1);
        if(b1 instanceof Wolf){
            Wolf w = (Wolf)b1;
            w.makeFlock();
        } else if (b1 instanceof Dog) {
            //犬の時の処理
        }
        b1.bark();

    }

    static Bark getBarkConcreteClass(int someConditoin){
        if(someConditoin == 0){
            return new Wolf();
        }
        else{
            return new Dog();
        }
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

    public void makeFlock(){
        System.out.println("群れを作る");
    }
}