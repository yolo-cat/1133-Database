class IcCard {  // �N�� IC �d�����O
  long id;      // �d��
  int money;    // �d���l�B
}

public class Card2 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // �إߪ���

    myCard.id = 0x336789AB;  // �]�w�����ܼƭ�
    myCard.money = 300;

    System.out.print("�d���d�� "+ myCard.id);
    System.out.println(", �l�B " + myCard.money + " �� ");
  }
}