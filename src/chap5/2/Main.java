package chap5

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
        Employee a = new Employee(); // A����p�I�u�W�F�N�g���쐬
        a.setId(100);   // ID���Z�b�g����
        Employee b = new Employee(); // B����p�I�u�W�F�N�g���쐬
        b.setId(200);   // ID���Z�b�g����
        System.out.println("A����F " + a.getId()); // ID�̕\��
        System.out.println("B����F " + b.getId()); // ID�̕\��
    }
}
