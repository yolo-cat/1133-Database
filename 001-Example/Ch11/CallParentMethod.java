class Parent { // �����O
  int i = 10;

  void Show() {
     System.out.println("i�G" + i);
  }
}

class Child extends Parent { // �l���O
  int i = 20; // �P�W����

  void Show() { // ���s�w�qShow
    System.out.println("i�G" + i);
    super.Show(); // �s�Τ����O����k
  }
}

public class CallParentMethod {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
    c.Show();
  }
}
