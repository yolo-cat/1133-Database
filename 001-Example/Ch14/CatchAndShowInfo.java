import java.io.*;

public class CatchAndShowInfo {

  public static void main(String[] argv) throws IOException{

    int[] secret = {65535,3001,1999,1496,119};
    System.out.print("���{���� 5 �ӯ����Ʀr, �z�n�ݲĴX�ӡH");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int target = Integer.parseInt(str); // �ഫ�� int

    try {

      System.out.println("�� " + target + " �ӯ����Ʀr�O "
                          + secret[target-1]);
    } catch (ArrayIndexOutOfBoundsException e) {

      System.out.println("�z���w�����ƶW�X�d��C");
      System.out.println("�z�n�ݪ��O�� " + target + " �ӯ����Ʀr,");
      System.out.println("  ���ڭ̥u�� 5 �ӯ����Ʀr�C");
    }

    System.out.println("�w��A���ϥΡI");
  }
}
