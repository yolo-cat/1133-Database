import java.util.Scanner; // ����J��ƥ[�W���{��

public class CheckOilScan {

  public static void main(String[] argv){

    System.out.println("�п�J�ثe�ҳѪo�q (���G����)");
    System.out.print("��");

    // ����J��ƥ[�W���{��
    Scanner sc = new Scanner(System.in);
    
    int liter = sc.nextInt(); // ���o��J���,�N��J����ন���

    if (liter < 2)
      System.out.println("�o�q�w�g����, �ӥ[�o�F�I");

    System.out.println("���z�樮�r�֡C");
  }
}
