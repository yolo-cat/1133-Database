import java.io.*;

public class CountEven {

  public static void main(String args[]) throws IOException {

    // �ŧi�֥[�� sum �έp��d�� range
    int sum = 0, range;

    System.out.print("�п�J���p�⪺���ƩM�d��(�����ƭ�)�G");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    range = Integer.parseInt(str);

    int i=0;           // �ŧi�j���ܼ� i
    while (i<=range) { // �� i �Ȥj�� range �Y������檺 while �j��
      sum += i;        // �C���i�J�j���, �N sum ���ȥ[�W i
      i+=2;            // �C�����N i �ȥ[ 2
    }
    System.out.println("1 �� "+range+" ���Ҧ����ƩM�� "+sum);
  }
}
