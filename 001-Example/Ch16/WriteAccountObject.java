import java.io.*;

public class WriteAccountObject {

  public static void main(String[] argv) throws IOException {

    System.out.print("²��b������p��, ");
    System.out.println("�}��n�s�h�ֿ��H");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    Account myAccount =                 // �H��J���B���غc��k�Ѽ�
         new Account(Integer.parseInt(br.readLine()));

    ObjectOutputStream oos =            // �إߪ����X��y����
      new ObjectOutputStream(new FileOutputStream("AccountFile"));

    oos.writeObject(myAccount);         // �g�J����
    oos.flush();
    oos.close();

    System.out.println("�w�N�b���T�s���ɮ� AccountFile�I");
  }
}
