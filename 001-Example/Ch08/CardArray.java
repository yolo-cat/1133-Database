class IcCard {  // �N�� IC �d�����O
  long id;      // �d��
  int money;    // �d���l�B

  void showInfo() {  // ��ܥd����T����k
    System.out.print("�d���d�� "+ id);
    System.out.println(", �l�B " + money + " �� ");
  }
}

public class CardArray {
  public static void main(String[] argv) {
    IcCard[] manyCards = new IcCard[3];     // �إߪ���}�C

    for(int i=0;i<manyCards.length;i++) {
      manyCards[i] = new IcCard();       // �إߪ���
      manyCards[i].id = 0x336789AB + i;
      manyCards[i].money = 100 + i * 123;
    }

    for(IcCard c : manyCards)  // �]�i�H�� For-each �j��
      c.showInfo();      // �I�s��k
  }
}