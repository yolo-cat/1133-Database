class Parent { // �����O
  static int i = 10;

  final void Show() {
    System.out.println("i�G" + i);
  }
}

class Child extends Parent { // �l���O
  static int i = 20;

  void Show() { // ���୫�s�w�q
    System.out.println("i�G" + i);
  }
}

public class FinalAccess {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
  }
}
