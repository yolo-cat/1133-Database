import java.io.*;

public class WriteBinary {

  public static void main(String args[]) throws IOException {

    System.out.println("�n�إߪ��G�����ɦW");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();         // ���o�ɦW�r��
    DataOutputStream dout =
      new DataOutputStream (                 // �غc�̤W�h���g�J��y
        new BufferedOutputStream(            // �]��U�h���w�Ħ���y
          new FileOutputStream(filename)));  // �̤U�h���ɮ׿�X��y

    for(int i=49;i>=38;i--) {        // �q 49 ��� 38
      double hopeless = i;           // �p�� i �� 6 �@���X�زզX

      for (int j=1 ; j<6; j++)       // �������b�p�� i!/((i-6)! * 6!)
        hopeless = hopeless * (i-j); // ���B�w�N�B�⦡²��,
      hopeless = hopeless / 720;     // �å��u���� i! �� (i-6)!

      dout.writeInt(i);              // �g�J���
      dout.writeDouble(hopeless);    // �g�J�B�I��
    }

    System.out.println("�@�g�J " + dout.size() + " �Ӧ줸�աI");
    dout.flush();      // �g�J��y
    dout.close();      // ������y
  }
}