import java.util.*; // ����J��ƥ[�W���{��

public class CheckOilThree {

  public static void main(String[] argv) {

    System.out.print("�п�J�ثe�ҳѪo�q (���G����)�G");

    Scanner sc = new Scanner(System.in); // ����J��ƥ[�W���{��
    int liter = sc.nextInt();  // �N��J����ন���

    if ((liter >= 2) && (liter < 5)) {
      System.out.println("�o�q�|��, �����z�`�N�o��C");
    }

    System.out.println("���z�樮�r�֡C");
  }
}