public class LoopCount_1to100 {

  public static void main(String args[]) {

    int sum = 0, i; // �ŧi�֥[�� sum �P�j���ܼ� i

    for (i=1;i<=100;i++) { // �] 100 ���� for �j��
      // �C�]�@���j��N�֥[�@�� i ��
      sum += i;

      // �C�]�@���j��N��X�@�� sum ��
      System.out.println("�ثe�֥[�Ȭ�" + sum);
    }
  }
}
