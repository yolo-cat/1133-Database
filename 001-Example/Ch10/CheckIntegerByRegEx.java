import java.io.*;

public class CheckIntegerByRegEx {
        
  public static void main(String[] argv) throws IOException {
     BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

     String str;        // �O���ϥΪ̿�J���
     boolean isInteger; // �ϥΪ̿�J�O�_�����
     do {
       isInteger = true;
       System.out.print("�п�J��ơG");
       str = br.readLine(); // Ū���ϥΪ̿�J���

       if(!str.matches("[0-9]+")) { // ���O���
         System.out.println("�z��J�����O��ơI");
         isInteger = false;
       }
     } while (!isInteger);
  }
}
