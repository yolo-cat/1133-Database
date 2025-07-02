class Parent {       // �����O
  static int i = 10; // Parent �Ψ�l���O����@��

  void Show() {
    System.out.println("i�G" + i);
  }
}

class Child extends Parent { // �l���O
  static int i = 20;         // Child �Ψ�l���O����@��

  void Show() {
     System.out.println("i�G" + i);
     System.out.println("super.i�G" + super.i);
  }
}

public class SuperStatic {
  public static void main(String[] argv) {
    Child c1 = new Child(); // ���ͤl���O������
    Child c2 = new Child(); // ���ͤl���O������

    c1.Show();
    c2.i = 80; // ��諸�O Child ���O���� i
    c1.Show();

    Parent p = c1;
    System.out.println("p.i�G" + p.i); // ���o�����O������
  }
}
