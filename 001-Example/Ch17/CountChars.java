import java.io.*;

public class CountChars {

  public static void main(String args[]) throws IOException {

    System.out.print("�п�J�@�ӥy�l");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    System.out.print("��");
    String str = br.readLine();
    int lt=0,di=0,sp=0;      // �ŧi�Ψӭp��U���r���ƶq���ܼ�

    for(int i=0;i<str.length();i++) {
      char ch = str.charAt(i);
      if (Character.isLetter(ch))          // �P�_�O�_����r
        lt++;
      else if (Character.isDigit(ch))      // �P�_�O�_���Ʀr
        di++;
      else if (Character.isWhitespace(ch)) // �P�_�O�_���ť�
        sp++;
    }
    System.out.println("�o�ӥy�l��, �@�� " + lt + " �Ӥ�r�B " +
                       di + " �ӼƦr�B " + sp + " �Ӫťզr��");
  }
}
