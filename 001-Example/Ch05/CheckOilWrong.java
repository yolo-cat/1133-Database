import java.util.*; // ����J��ƥ[�W���{��

public class CheckOilWrong {

  public static void main(String[] argv) {

    System.out.print("�п�J�ثe�ҳѪo�q (���G����)�G");

    Scanner sc = new Scanner(System.in); // ����J��ƥ[�W���{��
    int liter = sc.nextInt();  // �N��J����ন���

    if (liter < 2)      // �[�j�A��
      System.out.println("�o�q�w�g����");
      System.out.println("�ӥ[�o�o�I");
                        // �������j�A��

    System.out.println("���z�樮�r�֡C");
  }
}
