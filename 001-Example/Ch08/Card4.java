class IcCard {  // �N�� IC �d�����O
  long id;      // �d��
  int money;    // �d���l�B

  void showInfo() {  // ��ܥd����T����k
    System.out.print("�d���d�� "+ id);
    System.out.println(", �l�B " + money + " �� ");
  }
}

public class Card4 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // �إߪ���
    myCard.id = 0x336789AB;  // �]�w�����ܼƭ�
    myCard.money = 300;

    IcCard hisCard = new IcCard();  // �إߥt�@�Ӫ���
    hisCard.id = 0x3389ABCD; // �]�w�����ܼƭ�
    hisCard.money = 999;

    myCard.showInfo();        // �I�s��k
    System.out.println();
    hisCard.showInfo();       // �I�s��k
  }
}