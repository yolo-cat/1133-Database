class Parent { // �����O
  void Show() {
     System.out.println("�ڬO�����O");
  }
}

class Child extends Parent { // �l���O
  void Show() {              // ���s�w�q������
    System.out.println("�ڬO�l���O");
  }

  void Show(String str) { // �h���w�q������
    System.out.println(str);
  }
}

public class Polymorphism {
  public static void main(String[] argv) {
    Parent p = new Parent(); // ���ͤ����O������
    Child c = new Child();   // ���ͤl���O������
    p.Show(); // �I�s�����O�w�q����k
    c.Show(); // �I�s�l���O���w�q����k

    p = c;    // �Τ����O���ѷӫ��V�l���O
    p.Show(); // �I�s���@�� Show() ��k�H
  }
}
