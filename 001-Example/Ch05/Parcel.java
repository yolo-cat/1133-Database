import java.util.*; // ����J��ƥ[�W���{��

public class Parcel {

  public static void main(String[] argv) {
    System.out.print("����v�t�O��, �]�ؤj�p�X����(��+�e+��)�H");

    Scanner sc = new Scanner(System.in); // ����J��ƥ[�W���{��
    int size = sc.nextInt();  // �N��J����ন���

    if (size <= 100) { // ���� 1
      System.out.println("150��");
    }
    else if (size <= 150) { // ���� 2
      System.out.println("200��");
    }
    else if (size <= 200) { // ���� 3
      System.out.println("250��");
    }
    else { // �e 3 �ӱ��󳣤����ߪ���
      System.out.println("���p���ȪA�H��!");
    }
  }
}
