import java.util.*; // ����J��ƥ[�W���{��

public class Evaluate {

  public static void main(String[] argv) {

    System.out.print("�п�J�~�צ��Z (�u�B�ҡB�A�B��)�G");

    Scanner sc = new Scanner(System.in); // ����J��ƥ[�W���{��
    String grade = sc.next();  // ���o�r��

    switch (grade) {
      case "�u":  // ��~�צ��Z���u
        System.out.println("�X��h��");
        break; // ������ case
      case "��":  // ��~�צ��Z����
        System.out.println("�R�x�������ۤv");
        break; // ������ case
      case "�A":  // ��~�צ��Z���A
        System.out.println("�h�}����P�߱�");
        break; // ������ case
      case "��":  // ��~�צ��Z����
        System.out.println("�ǳƤW�D¾������u�@");
        break; // ������ case
    }
  }
}