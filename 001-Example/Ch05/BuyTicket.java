import java.util.*;

public class BuyTicket {

  public static void main(String[] argv) {

    System.out.print("�n�R���� (1.���� 2.�u�ݲ� 3.�P����)�H");

    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    switch(choice) {
      case 1:  // ����
        System.out.println("���� 399 ��");
        break;
      case 2:  // �u�ݲ�
        System.out.println("�u�ݲ� 199 ��");
        break;
      case 3:  // �P����
        System.out.println("�P���� 249 ��");
        break;
      default: // �䥦���p
        System.out.println("��J���~");
    }
  }
}