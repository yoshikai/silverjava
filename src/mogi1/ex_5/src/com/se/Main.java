package mogi1.ex_5.src.com.se;

public class Main {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.setNum(100);
        System.out.println(obj.getNum());
    }
}