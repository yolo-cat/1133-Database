public class Trigonometric {

  public static void main(String args[]) {

    System.out.println("����\tsin()(��5��)\tsin()(��17��)");

    for(int i=1;i<=3;i++)    // �p�� 30�B60�B90 �ת� SIN ��ƭ�
      System.out.printf("%3d\t%+.5f\t%2$+.17f\n",
                        30*i, Math.sin(i*Math.PI/6));

    for(int i=4;i<=6;i++)    // �p�� 120�B150�B180 �ת� SIN ��ƭ�
      System.out.printf("%3d\t%+.5f\t%2$+.17f\n",
                        30*i, Math.sin(Math.toRadians(30*i)));
  }
}
