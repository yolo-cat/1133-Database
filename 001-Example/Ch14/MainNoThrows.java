import java.io.*;

public class MainNoThrows {

  public static void main(String[] argv) {
                              // ���[�W throws IOException �F
    int[] secret = {65535,3001,1999,1496,119};
    System.out.println("���{���� 5 �ӯ����Ʀr, �z�n�ݲĴX�ӡH");
    System.out.print("��");

    int target;
    // �� try �Ӷi��Ū����ƪ��ʧ@
    try {
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      target = Integer.parseInt(str); // �ഫ�� int
    }
    // ���� IOException �ҥ~, �����S������B�z
    catch (IOException e) {
      System.out.println("�o�� IO �ҥ~");
      target = 5;
    }

    if (target > secret.length)
      target = secret.length;

    System.out.println("�� " + target + " �ӯ����Ʀr�O "
                          + secret[target-1]);
  }
}
