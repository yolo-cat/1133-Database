import java.io.*;

public class Deltaic {

  public static void main(String[] argv)
        throws IOException {

    BufferedReader br = new 
        BufferedReader(new InputStreamReader(System.in));

    int i,j,k;

    // ��J�� 1 �����
    System.out.println("�п�J�T���Ϊ��T����G");
    System.out.print("��� 1 ��");
    String str = br.readLine();
    i = Integer.parseInt(str);

    // ��J�� 2 �����
    System.out.print("��� 2 ��");
    str = br.readLine();
    j = Integer.parseInt(str);

    // ��J�� 3 �����
    System.out.print("��� 3 ��");
    str = br.readLine();
    k = Integer.parseInt(str);

    if ((i+j) > k)     // �P�_�� 1, 2 �䪺�M�O�_�j��� 3 ��
      if ((i+k) > j)   // �P�_�� 1, 3 �䪺�M�O�_�j��� 2 ��
        if ((j+k) > i) // �P�_�� 2, 3 �䪺�M�O�_�j��� 1 ��
          System.out.println("�i�H���T���Ϊ��T����C");
        else
          System.out.println("�� 2�B3�䪺�M���j��� 1 ��"); 
      else
        System.out.println("�� 1�B3�䪺�M���j��� 2 ��");    
    else
      System.out.println("�� 1�B2�䪺�M���j��� 3 ��"); 
  }
}