class Parent { // �����O
  int i = 10;

  Parent(int i) { // �غc��k
    this.i = i;
  }

  void Show() {
    System.out.println("i�G" + i);
  }
}

class Child extends Parent { // �l���O
  Child() {    // �غc��k
    super(10); // �ϥ� super �I�s�����O���غc��k
  }
}

public class NotConstructor {
  public static void main(String[] argv) {
    Child c = new Child(10); // ���ͤl���O������
  }
}
