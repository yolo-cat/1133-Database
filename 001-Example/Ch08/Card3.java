class IcCard {  // �N�� IC �d�����O
  long id;      // �d��
  int money;    // �d���l�B

  void showInfo() {  // ��ܥd����T����k
    System.out.print("�d���d�� "+ id);
    System.out.println(", �l�B " + money + " �� ");
  }
}

public class Card3 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // �إߪ���

    myCard.id = 0x336789AB;  // �]�w�����ܼƭ�
    myCard.money = 300;

    myCard.showInfo();       // �I�s��k
  }
}