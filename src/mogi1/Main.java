package mogi1;
class Parent {
    String name = "A";                      //4
    void print() { System.out.print(name);} //5
}
class Child extends Parent {
    String name = "B";                      //8
    void print() { System.out.print(name);} //9
}
public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();           //13
        obj.print();                        //14
        System.out.println(" " + obj.name); //15
    }

}

class Animal {
    private int walkSpeed = 10;
    public void setWalkSpeed(int i){
        this.walkSpeed = i;
    }
}