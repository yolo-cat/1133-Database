import java.io.*;

public class ReplaceAll {
        
  public static void main(String[] argv) throws IOException {
    BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    String src; // �O���ϥΪ̿�J���
    String pat; // �O���˦�
    String rep; // �O���n���N�����G

    System.out.print("�п�J�r��G");
    src = br.readLine(); // Ū���ϥΪ̿�J�r��

    System.out.print("�п�J�˦��G");
    pat = br.readLine(); // Ū���ϥΪ̿�J�˦�

    System.out.print("�п�J�n���N���G");
    rep = br.readLine(); // Ū���ϥΪ̿�J�r��

    System.out.println(src.replaceAll(pat,rep));
  }
}
