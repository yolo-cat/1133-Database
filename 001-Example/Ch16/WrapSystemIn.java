import java.io.*;

public class WrapSystemIn {

  public static void main(String args[]) throws IOException {

    // �� InputStreamReader Ū��
    System.out.print("�п�J�@��r�G");
    InputStreamReader ir = new InputStreamReader(System.in);

    char[] ch = new char[80];       // �ΨӦs��Ū�쪺�r��
    int i=0;
                                              // �ΰj�����Ū��
    while ( (ch[i] = (char) ir.read())!= 10)  // ����J�촫��r��
      i++;

    System.out.print("�� InputStreamReader Ū�쪺�O�G");
    for (int j=0;j<i;j++)
      System.out.print(ch[j]);      // �̧ǦL�X�C�Ӧr��
    System.out.println();

    // ��� BufferedReader Ū��
    System.out.print("�ЦA��J�@��r�G");
    BufferedReader br = new BufferedReader(ir);

    String str = br.readLine();
    System.out.println("�� BufferedReader Ū�쪺�O�G" + str );
  }
}
