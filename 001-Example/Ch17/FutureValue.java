import java.io.*;

public class FutureValue {

  public static void main(String args[]) throws IOException {

    System.out.println("�p������x�W�����Q�M");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�w�s�Q�� (%)�G");
    String str = br.readLine();
    float rate = Float.parseFloat(str);  // ���o�Q��

    System.out.print("�n�s�X�~�H�G");
    str = br.readLine();
    int year = Integer.parseInt(str);  // ���o�~��

    final int pv = 1_000_000;  // �����w���@�ʸU
    System.out.println("\n"+ pv + " ���H�Q�v " + rate  +
                       " % �s " +year + " �~");
    System.out.printf("�H�ƧQ�p��, ����ɪ����Q�M�� %.1f ��",
                       pv * Math.pow(1+rate/100, year));
  }
}
