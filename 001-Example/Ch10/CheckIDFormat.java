import java.io.*;

public class CheckIDFormat {
        
 public static void main(String[] argv) throws IOException {
   BufferedReader br =
     new BufferedReader(new InputStreamReader(System.in));

   String str; // �O���ϥΪ̿�J���
   boolean isID; // �ϥΪ̿�J���榡�O�_���T
   do {
      isID = true;
      System.out.print("�п�J�����Ҧr���G");
      str = br.readLine(); // Ū���ϥΪ̿�J���

      if(!str.matches("[a-zA-Z]\\d{9}")) { // �����T
         System.out.println(
                 "�����Ҧr�����ӬO1�ӭ^��r������9�ӼƦr�I");
         isID = false;
      }
   } while (!isID);
 }
}
