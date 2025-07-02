class IcCard {  // �N�� IC �d�����O
  private long id;      // �d��
  private int money;    // �d���l�B

  public void showInfo() {  // ��ܥd����T����k
    System.out.print("�d���d�� "+ id);
    System.out.println(", �l�B " + money + " �� ");
  }

  public Boolean add(int value) {  // �[�Ȥ�k�G�ѼƬ��n�[�Ȫ����B
    if (value>0 && value+money <= 10000) { // �x�ȤW���@�U
      money += value;
      return true;   // �[�Ȧ��\
    }
    return false;    // �[�ȥ���
  }

  public IcCard(long id, int money) {
    this.id = id;
    this.money = money;
  }

  public IcCard(long id) {
    this(id, 0);  // �I�s 2 �ӰѼƪ�����
  }
}


public class TestCard {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard(0x336789AB, 500); // �إߪ���
    IcCard hisCard = new IcCard(0x13572468);     // �إߪ���

    System.out.println("�ڪ��d���[�� 500 ��" +
               (myCard.add(500) ? "���\":"����") );
    myCard.showInfo();       // �I�s��k

    System.out.println("�L���d���[�� 9000 ��" +
               (hisCard.add(9000) ? "���\":"����") );
    hisCard.showInfo();      // �I�s��k
  }
}