class Parent { // �����O
  int i = 10;
}

class Child extends Parent { // �l���O
  int i = 20;

  public void Show() {
    System.out.println("super.i�G" + super.i);
    System.out.println("c.i�G" + i);
  }
}

public class Super {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
    c.Show(); // �z�Lsuper�O�d�r�s�������O�P�W����
    Parent p = c;
    System.out.println("p.i�G" + p.i);
  }
}
