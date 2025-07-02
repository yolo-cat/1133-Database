import java.io.*;

public class BufferedFile {

  public static void main(String args[]) throws IOException {

    System.out.println("�n�إߪ��q�T���ɦW");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();           // ���o�ɦW�r��
    BufferedWriter bw  =                       // �إ߽w�Ħ�Ū������
      new BufferedWriter(new FileWriter(filename));
    String str = new String();

    do {
      System.out.print("�п�J�m�W�G");

      str = br.readLine();
      bw.write(str,0,str.length());    // �g�J�m�W
      bw.write('\t');                  // �g�J�w�� (tab) �r��

      System.out.print("�п�J�q�ܸ��X�G");

      str = br.readLine();
      bw.write(str,0,str.length());    // �g�J�q�ܸ��X
      bw.newLine();                    // ����, �b Windows ���x�W
                                       // �۷��g�J������k��r��
      System.out.print("�٭n��J�t�@����ƶ� (y/n)�G");
      str = br.readLine();
    } while (str.equalsIgnoreCase("Y")); // �^�� Y/y �Y�A����@���j��

    bw.flush();         // �Y���|���g�J�����e, �ߧY�����g�J��y��
    bw.close();         // ���� FileWriter ��y����

    System.out.println("\n�w�N��Ƽg�J�ɮ� " + filename);
    System.out.print("�z�Q�ߧY�˵��ɮפ��e�� (y/n)�G");
    str = br.readLine();

    if (str.equalsIgnoreCase("Y")) {  // �^�� Y/y �Y����ɮפ��e
      BufferedReader bfr =            // �إ� BufferedReader ����
        new BufferedReader(new FileReader(filename));
      while ((str = bfr.readLine()) != null) // Ū��Ŧr��e����Ū��
        System.out.println(str);             // ��XŪ�쪺�@���
      bfr.close();
      }
  }
}
