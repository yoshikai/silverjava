package chap5.p191;

class Employee {
    private int id;  // インスタンス変数にprivateを指定
    protected String name = null;   //protected
    String firstName = null;        //アクセス修飾子はデフォルト
    public String lastName = null;  //アクセス修飾子はPublic

    public Employee(int i) {
        id = i;
    } // コンストラクタにpublicを指定

    public int getId() {
        return id;
    } // メソッドにpublic修飾子を指定
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(100);
        // private指定されたメンバは、他クラスからアクセス不可
        //System.out.println("private指定のインスタンス変数へのアクセス : " +  emp.id);
        // public指定されたメンバは、他クラスからアクセス可
        System.out.println("public指定のメソッドへアクセス : " + emp.getId());

        emp.name = "John";    //protected
        emp.firstName = "Tom";  //デフォルト
        emp.lastName = "Denny"; //public

    }
}
