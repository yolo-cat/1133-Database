import java.io.*;

public class NRoot {

  public static void main(String args[]) throws IOException {

    System.out.println("�n�D�X�����");
    System.out.print("����J��ơ�");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    try {
      int n = Integer.parseInt(str);
      System.out.println("�n�D����ƪ� " + str +" �����");
      System.out.print("(�ݤj��s)��");

      str = br.readLine();
      double y = Math.abs(       // �ε���Ȥ�k������
                      Double.parseDouble(str));
      System.out.printf("%f��%d����ڬ�%f",y,n, Math.pow(y, 1.0/n));
    }
    catch (NumberFormatException e) {
      System.out.println("��J�榡���~");
    }
  }
}
