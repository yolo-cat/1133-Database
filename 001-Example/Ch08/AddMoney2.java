class IcCard {  // �N�� IC �d�����O
  long id;      // �d��
  int money;    // �d���l�B

  void showInfo() {  // ��ܥd����T����k
    System.out.print("�d���d�� "+ id);
    System.out.println(", �l�B " + money + " �� ");
  }

  Boolean add(int value) {  // �[�Ȥ�k�G�ѼƬ��n�[�Ȫ����B
    if (value>0 && value+money <= 10000) { // �x�ȤW���@�U
      money += value;
      return true;   // �[�Ȧ��\
    }
    return false;    // �[�ȥ���
  }
}

public class AddMoney2 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // �إߪ���
    myCard.id = 0x336789AB;  // �]�w�����ܼƭ�
    myCard.money = 300;

    System.out.println("�[�� 900 ��" +
               (myCard.add(900) ? "���\":"����") );
    myCard.showInfo();       // �I�s��k

    System.out.println("�[�� 9000 ��" +
               (myCard.add(9000) ? "���\":"����") );
    myCard.showInfo();       // �I�s��k
  }
}