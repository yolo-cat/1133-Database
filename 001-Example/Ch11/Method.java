class Parent { // �����O
  void Show() {
    System.out.println("�ڬO�����O");
  }
}

class Child extends Parent { // �l���O
}

public class Method {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
    c.Show(); // �s�Τ����O���w�q����k
  }
}
