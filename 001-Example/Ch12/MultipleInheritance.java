interface P1 { // ������
  int i = 20;

  void showI();
}

interface P2 { // ������
  int j = 30;

  void showJ();
}

interface C extends P1,P2 { // �l����
  void show();
}

public class MultipleInheritance implements C { // ��@����
  public void showI() { // ��@��C�~��P1�ӨӪ���k
    System.out.println("�ܼ� i �����e�G" + i);
  }

  public void showJ() { // ��@��C�~��P2�ӨӪ���k
    System.out.println("�ܼ� j �����e�G" + j);
  }

  public void show() { // ��@C�ҩw�q����k
    showI();
    showJ();
  }

  public static void main(String[] argv) {
    MultipleInheritance s = new MultipleInheritance();
    s.show();
  }
}
