import java.io.*;

public class ReadTxtFile {

  public static void main(String args[]) throws IOException {

    System.out.println("�nŪ�����ɮצW�� (���|)");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();           // ���o�ɦW�r��
    FileReader fr = new FileReader(str);  // �إ� FileReader ����

    System.out.println("\n�H�U�O��r�� " + str + " �����e�G");
    int ch;
    while ((ch=fr.read()) != -1)    // �bŪ�� -1 ���e, ����Ū��
      System.out.print((char)ch);   // �����NŪ�쪺��r��X

    fr.close();
  }
}
