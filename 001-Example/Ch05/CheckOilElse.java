import java.util.*; // ���F��J��Ʀӥ[�W���{��

public class CheckOilElse {

  public static void main(String[] argv) {

    System.out.print("�п�J�ثe�ҳѪo�q (���G����)�G");

    Scanner sc = new Scanner(System.in); // ���F��J��Ʀӥ[�W���{��
    int liter = sc.nextInt();  

    if (liter < 2) { // ���� 1
      // �ԭz 1
      System.out.println("�o�q�w�g����, �ӥh�[�o�F�I");
    }
    else if (liter < 10) { // ���� 2
      // �ԭz 2
      System.out.println("�o�q�|��, �����z�`�N�o��C");
    }
    else {  // �e���Ҧ����󳣤����߮�
      // �ԭz 3
      System.out.println("�o�q�R��, �Цw�ߤW��");
    }

    System.out.println("���z�樮�r�֡C");
  }
}
