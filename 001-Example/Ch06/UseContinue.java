import java.util.*;

public class UseContinue {
  public static void main(String args[]) {

    // �ŧi�֥[�� sum, �p��d�� range, �j���ܼ� i
    int sum = 0, range, i;

    System.out.print("�п�J���p�⪺�_�ƩM�d�� (�����ƭ�)�G");
    Scanner sc = new Scanner(System.in);
    range = sc.nextInt();

    // �� 1 �}�l, �C���[ 1
    for (i=1; i<=range; i++) {
      if(i%2==0) continue;  // �Y�O���ƴN����U�@���j��
      sum += i;             // �_�Ƥ~�|�Q�֥[
    }
    System.out.println("1 �� "+range+" ���Ҧ��_�ƩM�� "+sum);
  }
}
