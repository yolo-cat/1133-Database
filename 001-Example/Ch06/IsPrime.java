import java.io.*;

public class IsPrime {
  public static void main(String args[]) throws IOException {

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

   while(true){                // ���ϥΪ̥i�ϴ_��J�s�ƭȪ��j��
      System.out.print("�п�J�n�ˬd���� (��J 0 ����)�G");

      String str = br.readLine();
      int num = Integer.parseInt(str);
      if(num == 0) break;      // �Y��J 0 �Y���X�j��, �����{��

      boolean isPrime = true;  // ��ܼƽ�O�_����ƪ����L��
      int range = num/2;  // ���w���ƪ��d��

      for (int i=2; i<=range; i++) {  // �����k�B�⪺�j��
        if ((num%i) == 0) {      // �l�Ƭ� 0 ��ܥi�H�㰣
          if (isPrime == true) {
            isPrime = false;     // �D���, �ÿ�X�ثe������
            System.out.print(num +" ���O���, �i�Q "+i);
          }
          else {                 // ��X�ثe������
            System.out.print(" "+i);
          }
        }
      }
      // �ˬd����, ���ˬd���G��X���P���T��
      if (isPrime) {           // �Y�O���, �Y��X�Ӽƭ�
         System.out.println(num +" �O���");
      }
      else {
         System.out.println(" �㰣");
      }
    }
  }
}
