import java.io.*;

public class TryWithRes {

  public static void main(String args[]) throws IOException {

    System.out.println("�п�J�s����v��ƪ��ɮצW��");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String filename = br.readLine();        // ���o�ɦW�r��

    double hopeless;

    try (DataInputStream din =
           new DataInputStream (
             new BufferedInputStream(
               new FileInputStream(filename))) ){
      while (true) {
        System.out.printf("%d �� 6 �@��%9.0f�رƦC�զX,",
          din.readInt(), (hopeless = din.readDouble()));
        System.out.format(" �q�����v��%15.12f\n", 1/hopeless);
        din.skipBytes (12);      // �CŪ�@���O���N���L�@���O��
      }                          // ��Ʀ� 4 ��, �B�I�Ʀ� 8 �Ӧ줸��
    }
    catch (EOFException e) {        // �����w���ɮ׵������ҥ~
        System.out.println("�w���ɮ׵���!");
    }
  }
}
