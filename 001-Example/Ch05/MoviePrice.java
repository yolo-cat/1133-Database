import java.io.*;

public class MoviePrice {
  public static void main(String[] argv) throws IOException {

    BufferedReader br = new 
        BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J�����ʪ��q�v������");
    System.out.print(
        "1.����(300) 2.�u�ݲ�(270) 3.������(240)�G");
    String str = br.readLine();         // ��J����
    int option = Integer.parseInt(str); // ����

    System.out.print("�п�J���ʱi�ơG");
    str = br.readLine();               // ��J�i��
    int num = Integer.parseInt(str);   // �i��

    int price;       // �q�v�����
    switch(option){  // �̾ڲ��ب��o���
      default:
      case 1: // ����(300)
        price = 300;
        break;
      case 2: // �u�ݲ�(270)
        price = 270;
        break;
      case 3: // ������(240)
        price = 240;
        break;
    }

    System.out.println("�`���G" + (price * num));
  }
}
