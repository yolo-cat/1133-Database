class IcCard {  // �N�� IC �d�����O
  long id;      // �d��
  int money;    // �d���l�B

  void showInfo() {  // ��ܥd����T����k
    System.out.print("�d���d�� "+ id);
    System.out.println(", �l�B " + money + " �� ");
  }

  void add(int value) {  // �[�Ȥ�k�G�ѼƬ��n�[�Ȫ����B
    money += value;
    System.out.println("�[�Ȧ��\, �����[�� " + value + " �� ");
  }
}

public class AddMoney1 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // �إߪ���

    myCard.id = 0x336789AB;  // �]�w�����ܼƭ�
    myCard.money = 300;

    myCard.add(1000);        // �[�� 1000
    myCard.showInfo();       // �I�s��k
  }
}