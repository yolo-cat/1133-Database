import java.io.*;

public class RandomLotto {
  public static void main(String args[]) {

    System.out.println("�ֳz�q���︹�w�w�۰ʲ���5�ո��X");
    System.out.println("�����Q�K�����o�ʶR�ΧI���m��I");

    int[] lotto= new int[49];      // �إ߼ֳz���X�}�C
    for(int i=1;i<=5;i++) {        // ���� 5 �ո��X���j��
      System.out.printf("%d) ",i); // ��ܶ}�Y�s��
      for (int j=0;j<49;j++)       // �N�}�C�����ȳ]�� 1��49
        lotto[j]=j+1;

      int count=0;          // �ΨӰO���w���ʹX�Ӹ��X
      do {
        int guess = (int)(Math.random()*49);

        if(lotto[guess]==0) // �Y���X�ҫ��������Ȭ� 0, ��ܦ��Ʀr�w
          continue;         // �X�{�L, �N���s����j��, ���ͥt�@�ü�
        else {
          System.out.print(lotto[guess]+"\t");
          lotto[guess]=0;   // �N���X�ҫ��������ȳ]�� 0, �H�K���ƥΨ�
          count++;
        }
      } while (count<6);    // ��X 6 �Ӹ��X�~����

      System.out.print('\n');   // �C���ͤ@�ո��X�N����
    }
  }
}