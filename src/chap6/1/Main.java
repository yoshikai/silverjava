package chap6

class Employee {   // �X�[�p�[�N���X�̒�`
    private String id = "100";

    public String getId() {
        return id;
    }
}

class Sales extends Employee {   // �T�u�N���X�̒�`
    private String clientName = "SE";

    public String getClientName() {
        return clientName;
    }
}

public class Main {  // �T�u�N���X�𗘗p���Ă���N���X
    public static void main(String[] args) {
        Sales s = new Sales(); // �T�u�N���X���C���X�^���X��
        // �T�u�N���X�Œ�`�������\�b�h�̌Ăяo��
        System.out.println("clientName : " + s.getClientName());
        // �X�[�p�[�N���X�Œ�`�������\�b�h�̌Ăяo��
        System.out.println("id         : " + s.getId());
    }
}
