import java.util.*;

public class HasNext {
  public static void main(String args[]) {
    // �ŧi�֥[�� sum, �p��d�� range, �j���ܼ� i
    int sum = 0, range, i;
    Scanner sc = new Scanner(System.in);
    System.out.print("�п�J���p�⪺�_�ƩM�d�� (�����ƭ�)�G");

    while(!sc.hasNextInt()) {
      System.out.print("�п�J��ơG");
      sc.next();
    }

    range = sc.nextInt();

    // �� 1 �}�l, �C���[ 2 ���� i �Ȥj�� range �� for �j��
    for (i=1; i<=range; i+=2) { // �C�]�@���j��N�N i �ȥ[ 2
      sum += i;
    }

    System.out.println("1 �� "+range+" ���Ҧ��_�ƩM�� "+sum);
  }
}
