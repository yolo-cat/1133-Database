import java.io.*;

public class Factorial {
  public static void main(String args[]) throws IOException {

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      System.out.println("�п�J 1-170 ������ƨӭp�ⶥ��");
      System.out.print("(��J 0 �Y�����{��)�G");
      String str = br.readLine();
      int num = Integer.parseInt(str);
      if (num == 0)
        break;          // �Y�ϥΪ̿�J 0, �N���X�j��
      else if (num>170)
        continue;       // �Y��J�j�� 170, �h���s��J

      System.out.print(num + "! ���� ");

      double fact;            // �Ψ��x�s�B�p�ⶥ���Ȫ��ܼ�
      for(fact=1;num>0;num--) // �p�ⶥ�����j��
        fact *= num;          // �C���ұN fact ���W�ثe�� num

      System.out.print(fact + "\n\n"); // ��X�p��ұo��������
    }
  }
}
