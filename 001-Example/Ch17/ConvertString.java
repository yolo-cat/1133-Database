import java.io.*;

public class ConvertString {

  public static void main(String args[]) throws IOException {

    System.out.println("���{���|�N�U�ضi��Ʀr�ন�Q�i�����");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      System.out.println("\n�z�n��J���Ʀr�O����i�� (�Ҧp" +
                         " 8 �i��N��J 8, ��J 0 �����{��) ");
      System.out.print("->");
      String str = br.readLine();

      try {     // �N�Ҧ��N�r���ন�Ʀr���ԭz����b try �϶�
        int radix = Integer.parseInt(str);  // ���o�i��Ʀr

        if (radix==0) break;    // ��J 0 �N���X�j��

        System.out.print("�п�J " + radix + " �i�쪺�Ʀr�G");
        str = br.readLine();

        long num = Long.parseLong(str,radix);  // �N�r���ন�����
        System.out.println(radix + " �i�쪺 " + str +
                           " �ন�Q�i���ܡG" + num);
      }
      catch (NumberFormatException e) { // �ഫ�ɪ��r��榡�����T
                                        // ����X�Ӫ��Ʀr�W�X long
                                        // �d��N�|�޵o���ҥ~
        System.out.println("��J�榡���~�μƭȤӤj�I");
      }
    }
  }
}
