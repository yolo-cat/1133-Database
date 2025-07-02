import java.io.*;

public class ReadBinary {

  public static void main(String args[]) throws IOException {

    System.out.println("�п�J�s����v��ƪ��ɮצW��");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String filename = br.readLine();        // ���o�ɦW�r��

    DataInputStream din =
      new DataInputStream (                 // �غc�̤W�h��Ū����y
        new BufferedInputStream(            // �]��U�h���w�Ħ�Ū����y
          new FileInputStream(filename)));  // �̤U�h���ɮ׿�X��y

    double hopeless;

    try {
      while (true) {
        System.out.print(din.readInt() + " �� 6 �@�� " +
                         (hopeless = din.readDouble()) +
                         " �رƦC�զX,");
        System.out.println(" �q�����v�� " + 1/hopeless);
        din.skipBytes (12);      // �CŪ�@���O���N���L�@���O��
      }                          // ��Ʀ� 4 ��, �B�I�Ʀ� 8 �Ӧ줸��
    }
    catch (EOFException e) {        // �����w���ɮ׵������ҥ~
        din.close();                // �w���ɮ׵���, �G������y
    }
  }
}
