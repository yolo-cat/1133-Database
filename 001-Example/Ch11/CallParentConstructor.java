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
  Child() { // �غc��k
    super(10); // �ϥ�super�s�Τ����O���غc��k
  }
}

public class CallParentConstructor {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
  }
}
