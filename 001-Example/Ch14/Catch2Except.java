import java.io.*;

public class Catch2Except {

  public static void main(String[] argv) throws IOException{

    int[] secret = {65535,3001,1999,1496,119};
    System.out.print("���{���� 5 �ӯ����Ʀr, �z�n�ݲĴX�ӡH ");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int target = 0;

    try {
      target = Integer.parseInt(str); // �ഫ�� int
      System.out.println("�� " + target + " �ӯ����Ʀr�O "
                          + secret[target-1]);
    } catch (ArrayIndexOutOfBoundsException |
             NumberFormatException e) {
      System.out.println("�藍�_, ��J���~�C");
      System.out.println("�нT�{�z��J 1-5 �������Ʀr�C");
    }
    System.out.println("�w��A���ϥΡI");
  }
}
