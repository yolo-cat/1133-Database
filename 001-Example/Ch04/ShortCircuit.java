public class ShortCircuit {
  public static void main(String[] argv) {
    int i=3, j=4;
    System.out.println("�ϥ� | ���B�⵲�G�G" +
      (true | (i++ == j))); // i++�|����
    System.out.println("�B���i�����e�G" + i);

    i = 3;
    j = 4;
    System.out.println("�ϥ� || ���B�⵲�G�G" +
      (true || (i++ == j))); // i++���|����
    System.out.println("�B���i�����e�G" + i);
  }
}
