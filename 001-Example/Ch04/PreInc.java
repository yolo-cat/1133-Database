public class PreInc {
  public static void main(String[] argv) {
    int i = 2,j;
    j = (i++) + i + 5; // ��m���W
    System.out.println("�ܼ� i �����e�O�G" + i);
    System.out.println("�ܼ� j �����e�O�G" + j);

    i = 2;
    j = (++i) + i + 5; // �e�m���W
    System.out.println("�ܼ� i �����e�O�G" + i);
    System.out.println("�ܼ� j �����e�O�G" + j);
  }
}
