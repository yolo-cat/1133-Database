import java.io.*;

public class WriteTxt {

  public static void main(String args[]) throws IOException {

    System.out.println("�n�إߪ��s�ɮצW�� (���|)");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();           // ���o�ɦW�r��
    FileWriter fw = new FileWriter(filename);  // �إ� FileWriter ����

    System.out.print("�п�J�r��G");
    String str = br.readLine();
    fw.write(str,0,str.length());      // �g�J��r�r��
    fw.write('\n');                    // �g�J����r��

    System.out.print("�п�J��ơG");
    str = br.readLine();
    fw.write(str,0,str.length());      // �g�J��Ʀr��
    fw.write('\n');                    // �g�J����r��

    System.out.print("�п�J�B�I��:");
    str = br.readLine();
    fw.write(str,0,str.length());       // �g�J�B�I�Ʀr��

    fw.flush();         // �Y���|���g�J�����e, �ߧY�����g�J��y��
    fw.close();         // ���� FileWriter ��y����

    FileReader fr = new FileReader(filename);  // �إ� FileReader ����
    int ch;
    while ((ch=fr.read()) != -1)    // �bŪ�� -1 ���e, ����Ū��
      System.out.print((char)ch);   // �����NŪ�쪺��r��X
    fr.close();
  }
}
