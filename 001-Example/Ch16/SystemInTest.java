import java.io.*;

public class SystemInTest {

  public static void main(String args[]) throws IOException {

    System.out.print("�p�� 2 �� N ����, �п�J����ȡG");

    char ch = (char) System.in.read();   // �� read() Ū�����ন�r��
    String str = Character.toString(ch); // �NŪ�쪺�r���ন�r��
    double pow = Double.parseDouble(str);
    System.out.println("2 �� " + pow + " ���赥�� " +
                        Math.pow(2,pow));

    System.out.print("\n�A��@�� 2 �� N ����, �п�J����ȡG");
    byte[] b = new byte[10];
    System.in.read(b);          // ��� read(byte[]) Ū��
    pow = Double.parseDouble(new String(b));
                  // �N�줸�}�C�ন�r��, �A�ন double
    System.out.println("2 �� " + pow + " ���赥�� " +
                        Math.pow(2,pow));
  }
}
