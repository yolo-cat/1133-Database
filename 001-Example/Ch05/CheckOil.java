import java.util.*; // ���F��J��Ʀӥ[�W���{��

public class CheckOil {

  public static void main(String[] argv) {

    System.out.print("�п�J�ثe�ҳѪo�q (���G����)�G");

    Scanner sc = new Scanner(System.in); // ���F��J��Ʀӥ[�W���{��
    int liter = sc.nextInt();  // ��J��Ƹ��

    if (liter < 2)   // �� liter �p�� 2, ���󦨥�
      System.out.println("�o�q�w�g����, �ӥ[�o�F�I");

    System.out.println("���z�樮�r�֡C");
  }
}