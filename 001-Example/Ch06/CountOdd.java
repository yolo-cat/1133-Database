import java.util.*;

public class CountOdd {

  public static void main(String args[]) {

int a[] = { 1,2,3,4,5 };  // �ŧi���t 5 �Ӥ����� a �}�C

for (int e: a)  // �C���� a �����X�@�Ӥ����s�J e, �M�����j��
   System.out.print(e);


    // �ŧi�֥[�� sum, �p��d�� range, �j���ܼ� i
    int sum = 0, range, i;

    System.out.print("�п�J���p�⪺�_�ƩM�d�� (�����ƭ�)�G");
    Scanner sc = new Scanner(System.in);
    range = sc.nextInt();

    // �� 1 �}�l, �C���[ 2 ���� i �Ȥj�� range �� for �j��
    for (i=1; i<=range; i+=2) { // �C�]�@���j��N�N i �ȥ[ 2
      sum += i;
    }
    System.out.println("1 �� "+range+" ���Ҧ��_�ƩM�� "+sum);
  }
}
