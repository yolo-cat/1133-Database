interface P1 { // ������
  int i = 20;

  void show();
}

interface P2 { // ������
  int j = 30;

  void show();
}

interface C extends P1,P2 { // �l����
  void show(String s); // �h���w�q������
}

public class NameConflict implements C { // ��@����
  public void show() { // ��@��P1�PP2C�~�ӨӪ���k
    show("");
  }

  public void show(String s) { // ��@C���h���w�q����k
    System.out.println(s + "i�G" + i + ",j�G" + j);
  }

  public static void main(String[] argv) {
    NameConflict s = new NameConflict();
    s.show();
  }
}
