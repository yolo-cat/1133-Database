class Parent { // �����O
  void Show() {
    System.out.println("�ڬO�����O");
  }
}

class Child extends Parent { // �l���O
  void Show() {
    System.out.println("�ڬO�l���O");
  }
}

public class Overriding {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
    c.Show(); // �s�Τl���O���w�q����k
  }
}
