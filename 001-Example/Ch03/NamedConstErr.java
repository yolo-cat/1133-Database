public class NamedConstErr {
  public static void main(String[] argv) {
    double r = 3.0;         //�b�|
    final double PI = 3.14; // ��P�v
    PI = 3.1416;            // ���s�]�w final �ܼƪ���
    System.out.println("��P�G" + 2 * PI * r);
    System.out.println("���n�G" + PI * r * r);
  }
}
