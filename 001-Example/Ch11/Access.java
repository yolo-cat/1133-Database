class Parent { // �����O
  public void Show() { // �̼e�P, �S������
    System.out.println("�ڬO�����O");
  }
}

class Child extends Parent { // �l���O
  private void Show() {      // ���Y��F�I
    System.out.println("�ڬO�l���O");
  }
}

public class Access {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
    Parent p = c;          // �z�L�����O���ѷӫ��VChild����
    p.Show();              // �i�H�s�ζܡH
  }
}
