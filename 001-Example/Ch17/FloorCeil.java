import java.io.*;

public class FloorCeil {

  public static void main(String args[]) throws IOException {

    System.out.print("�ܽd Math ���O����Ȥ�k���{��, ");
    System.out.print("�п�J�@�ӼƭȡG");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    double test = Double.parseDouble(str);  // ���o�ƭ�

    // �̧ǩI�s�U����Ȥ�k�ÿ�X���G
    System.out.println("floor(" + test + ") = " + Math.floor(test));
    System.out.println(" ceil(" + test + ") = " + Math.ceil(test));
    System.out.println(" rint(" + test + ") = " + Math.rint(test));

    System.out.println("long round(" + test + ") = " +
                       Math.round(test));
    System.out.println(" int roung(" + (float)test + ") = " +
                       Math.round((float)test));
  }
}
