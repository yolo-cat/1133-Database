import java.util.*;

public class SeasonWear {

  public static void main(String[] argv) {

    System.out.print("�п�J�u�` (1.�K 2.�L 3.�� 4.�V)�G");

    Scanner sc = new Scanner(System.in); // ����J��ƥ[�W���{��
    int season = sc.nextInt();   // ���o���

    switch (season) {
      case 1:  // �� season ���ƭȬ� 1
        System.out.println("�Ь�۪��S�X��");
               // �֤F break
      case 2:  // �� season ���ƭȬ� 2
        System.out.println("�Ь�۵u�S�X��");
        break; // ������ case
      case 3:  // �� season ���ƭȬ� 3
        System.out.println("�Х[����S�����~�M�X��");
        break; // ������ case
      case 4:  // �� season ���ƭȬ� 4
        System.out.println("�Ь�ۤ��Τj��X��");
        break; // ������ case
    }
  }
}