public class PostInc {
  public static void main(String[] argv) {
    int i = 0,j;
    j = (i++) * 10; // ��m���W
    System.out.println("�ܼ� i �����e�O�G" + i);
    System.out.println("�ܼ� j �����e�O�G" + j);

    i = 0;
    j = (++i) * 10; // �e�m���W
    System.out.println("�ܼ� i �����e�O�G" + i);
    System.out.println("�ܼ� j �����e�O�G" + j);
  }
}
