public class NamedConstantNoInit {
  public static void main(String[] argv) {
    double r = 3.0;  //�b�|
    final double PI; // ��P�v
    PI = 3.14;       // �]�w���
    System.out.println("��P�G" + 2 * PI * r);
    System.out.println("���n�G" + PI * r * r);
  }
}
