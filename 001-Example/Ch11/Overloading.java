class Parent { // �����O
  void Show() {
    System.out.println("�ڬO�����O");
  }
}

class Child extends Parent { // �l���O
  void Show(String str) {    // �P�����O�� show() �ѼƤ��P
    System.out.println(str);
  }
}

public class Overloading {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
    c.Show();              // �I�s�����O���w�q����k
    c.Show("�o�O�l���O");
  }
}
