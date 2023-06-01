package chap5.p167;

class Employee {

    Employee(int i){
        this.id = i;
    }
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
        Employee a = new Employee(100); // A用オブジェクトを作成
//        a.setId(100);   // IDをセット
        Employee b = new Employee(200); // B用オブジェクトを作成
//        b.setId(200);   // IDをセット
        System.out.println("Aさん " + a.getId()); // IDの表示
        System.out.println("Bさん " + b.getId()); // IDの表示
    }

}
