class Test {
  private int i = 1; // �p�������ܼ�

  void modifyMember(int i) {
    this.i = i; // ���O���i�H�s�� i
  }

  void show() { // ���O���i�H�s�� i
    System.out.println("�����ܼ�i�G" + i);
  }
}

public class PrivateMember {

  public static void main(String argv[]) {
    Test a = new Test();

    a.show();
    a.modifyMember(20);
    a.show();
    a.i = 40; // ���, i �O�p�������ܼ�
  }
}