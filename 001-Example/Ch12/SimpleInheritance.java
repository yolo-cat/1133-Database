interface P { // ������
  int i = 20;

  void show();
}

interface C extends P { // �l����
  int getI();
}

public class SimpleInheritance implements C { // ��@����
  public void show() { // ��@�� C �~�� P �ӨӪ���k
    System.out.println("�ܼ� i �����e�G" + i);
  }

  public int getI() { // ��@ C �ҩw�q����k
    return i;
  }

  public static void main(String[] argv) {
    SimpleInheritance s = new SimpleInheritance();
    s.show();
  }
}
