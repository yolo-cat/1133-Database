class Parent { // �����O
  void Show() {
    System.out.println("�ڬO�����O");
  }
}

class Child extends Parent { // �l���O
  void Show(String str) {    // �h���w�q������
    System.out.println(str);
  }
}

public class CallParent {
  public static void main(String[] argv) {
    Parent p = new Parent(); // ���ͤ����O������
    Child c = new Child();   // ���ͤl���O������
    p.Show(); // �s�Τ����O�w�q����k
    c.Show(); // �s�Τl���O���w�q����k

    p = c;    // �Τ����O���ѷӫ��V�l���O
    p.Show(); // �s�έ��@��Show��k�H
  }
}
