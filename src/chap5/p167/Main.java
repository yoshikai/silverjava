package chap5.p167;

class Employee {
    int id;

    void setId(int i) {
        id = i;
    }

    int getId() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee(); // A用オブジェクトを作成
        a.setId(100);   // IDをセット
        Employee b = new Employee(); // B用オブジェクトを作成
        b.setId(200);   // IDをセット
        System.out.println("A����F " + a.getId()); // IDの表示
        System.out.println("B����F " + b.getId()); // IDの表示
    }
}
