import java.util.*;

public class Food2Money {

  public static void main(String[] argv) {

    System.out.print(
        "�I�X���\ (1.�����\ 2.�~���\ 3.�_�q���\ 4.�ൣ�\)�H");

    Scanner sc = new Scanner(System.in);
    int food = sc.nextInt();

    switch(food){
      case 1: // �����\���� 109 ��
        System.out.println("�z�I���\�I������ 109 ��");
        break;
      case 2: // �~���\�M�_�q���\
      case 3: // ���O 99 ��
        System.out.println("�z�I���\�I������ 99 ��");
        break;
      case 4: // �ൣ�\������ 69 ��
        System.out.println("�z�I���\�I������ 69 ��");
        break;
    }
  }
}