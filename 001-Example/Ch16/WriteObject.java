import java.io.*;

public class WriteObject {

  public static void main(String args[]) throws IOException {

    System.out.println("�п�J�n�إߪ��ǥͦ��Z���ɦW");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String filename = br.readLine();         // ���o�ɦW�r��

    ObjectOutputStream os =                  // �إߪ����X��y����
      new ObjectOutputStream(new FileOutputStream(filename));

    String str = new String();
    int counter=0;

    do {
      counter++;

      System.out.print("�п�J�ǥͩm�W�G");
      String name = br.readLine();

      System.out.print("�п�J�^����ơG");
      str = br.readLine();
      short e = Short.parseShort(str);

      System.out.print("�п�J�ƾǤ��ơG");
      str = br.readLine();
      short m = Short.parseShort(str);

      System.out.print("�п�J Java ���ơG");
      str = br.readLine();
      short j = Short.parseShort(str);

      Student ss = new Student(name, e, m, j);

      os.writeObject(ss);    // �g�J������

      System.out.print("�٭n��J�t�@����ƶ� (y/n)�G");
      str = br.readLine();
    } while (str.equalsIgnoreCase("Y")); // �^�� Y �Y�A����@���j��

    os.flush();         // �Y���|���g�J�����e, �ߧY�����g�J��y��
    os.close();         // ������y����

    System.out.println("\n�w�g�J " + counter +
                       " ���ǥ͸�Ʀ��ɮ� " + filename);
  }
}
