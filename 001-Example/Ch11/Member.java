class Parent { // �����O
  int i = 10;
}

class Child extends Parent { // �l���O
  int i = 20;
}

public class Member {
  public static void main(String[] argv) {
    Parent p = new Parent(); // ���ͤ����O������
    Child c = new Child();   // ���ͤl���O������
    System.out.println("p.i�G" + p.i);
    System.out.println("c.i�G" + c.i);
  }
}
