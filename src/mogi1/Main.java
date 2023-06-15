package mogi1;

public class Main {

    public static void main(String[] args){
        int a = 100;
        int b = ++a;
        int c = b++;
        int d = ++c;
        System.out.println((a < b) ? (b < c) : (c < d) ? b : c);

    }

}

class Animal {
    private int walkSpeed = 10;
    public void setWalkSpeed(int i){
        this.walkSpeed = i;
    }
}