import java.io.*;

public class NewFactorial {

  public static void main(String args[]) throws IOException {

    long fact;  // �Ψ��x�s�����Ȫ������

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    try {
      while (true) {
        System.out.println("�п�J�@��ƨӭp�ⶥ�� (0 �N����)");
        System.out.print("��");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        if (num > 20)
          throw new ArithmeticException("���w�ƭȶW�X�d��");
        else if (num == 0)
          throw new RuntimeException("�{�������I");

        System.out.print(num + "! ���� ");

        for (fact=1;num>0;num--)   // �p�ⶥ���Ȫ��j��
          fact = fact * num;       // �C���ұN fact ���W num

        System.out.println(fact + "\n");
      }
    } catch (RuntimeException e) {
      System.out.println(e);
    }

    System.out.println("���±z�ϥζ����p��{���C");
  }
}
