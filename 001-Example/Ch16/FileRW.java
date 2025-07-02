import java.io.*;

public class FileRW {    
  public static void main(String[] args) throws IOException {
    Console c = System.console();
    
    File f = new File("a.txt");  // �غc�@�ӦW�� a.txt �� File ����
    if(f.exists())               // �p�G�ɮפw�s�b�h��ܰT��
      c.printf("�Ƽg a.txt\n");   
    
    // �H File ����ӫإ߿�X����
    PrintWriter pw = new PrintWriter(new FileWriter(f));
    pw.printf("Hello!\nBye.\n");   // �g��
    pw.flush(); pw.close();        // �s�ɤ�����

    File d = new File("my");            // �غc�W�� my ������
    d.mkdir();                      // �طs��Ƨ�
    File f2 = new File(d, "b.txt"); // �غc�W�� my\b.txt ������
    f.renameTo(f2);                 // ����ɦW�� my\b.txt
    
    // �H File ����ӫإ߿�J����
    BufferedReader br = new BufferedReader(new FileReader(f2));
    String s;
    c.printf("%s �����e�G\n", f2.toString());
    while((s = br.readLine()) != null)  // �C��Ū���@��
      c.printf("%s\n", s);
    br.close();                    // ����
    f2.delete();                   // �R��
  } 
}