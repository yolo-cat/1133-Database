import java.util.*;

public class ScanBoolean {
  public static void main(String[] argv) {
    System.out.print("���}�O�ܡH");
    Scanner sc = new Scanner(System.in);   // �� System.in ���o��J
    boolean lightIsOn = sc.nextBoolean(); // �ѿ�J�ݨ��o���L��


    System.out.println(lightIsOn ? "�O�G�F" : "�O���F");
  }
}

