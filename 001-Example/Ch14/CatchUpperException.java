import java.io.*;

public class CatchUpperException {

  public static void main(String[] argv) throws IOException {

    System.out.println("���{�����T�ӯ����Ʀr,");
    System.out.print("�z�n�ݲĴX�ӡ�");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int choice1 = Integer.parseInt(str); // �ഫ�� int

    System.out.println("���{�������ӯ����^��r��,");
    System.out.print("�z�n�ݲĴX�ӡ�");

    str = br.readLine();
    int choice2 = Integer.parseInt(str); // �ഫ�� int

    int[] a = {123,456,789};     // �t�����Ʀr���}�C
    String s = "MONDAY";         // �t�����^��r�����r��

    try {
      System.out.println("a[" +  choice1 + "]�G" + a[choice1-1]);
      System.out.println(s.charAt(choice2));
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("�o�ͨҥ~�G" + e );
      System.out.println("���޶W�X�d��F!");
    }
  }
}
