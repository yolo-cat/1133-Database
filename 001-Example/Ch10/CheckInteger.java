import java.io.*;

public class CheckInteger {
        
 public static void main(String[] argv) throws IOException {
   BufferedReader br =
           new BufferedReader(new InputStreamReader(System.in));

   String str;        // �O���ϥΪ̿�J���
   boolean isInteger; // �ϥΪ̿�J�O�_�����
   do {
      isInteger = true;
      System.out.print("�п�J��ơG");
      str = br.readLine(); // Ū���ϥΪ̿�J���

      for(int i = 0;i < str.length();i++) {
        char ch = str.charAt(i);   // ���X�ӧO�r��
        if(ch < '0' || ch > '9') { // ���O�Ʀr
          System.out.println("�z��J�����O��ơI");
          isInteger = false;
          break;           // �w�ˬd�X�D�Ʀr�A�����~��
        }
      }
   } while (!isInteger);
 }
}
