import java.io.*;

public class IsoscelesTriangle {

  public static void main(String args[]) throws IOException {

    System.out.println("�n�e�h�����P���T���� (���)");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int line = Integer.parseInt(str);

    for (int i=1;i<=line;i++) {   // �~�j��, �����
      for (int j=1;j<=line-i;j++) // ���j�� 1, �����X�ť�
        System.out.print(" ");
      for (int k=1;k<2*i;k++)     // ���j�� 2, �����X�P��
        System.out.print("*");
      System.out.println();     // �C��X�@��N����
    }
  }
}
