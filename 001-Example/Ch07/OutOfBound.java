public class OutOfBound {
  public static void main(String[] argv) {
    int[] a; // �ŧi�}�C�ܼ�
    a = new int[4]; // �t�m�}�C

    a[1] = 10; // ��J���e
    a[2] = 10;
    a[3] = 10;
    a[4] = 10;

    // ���X���e�����
    for(int i = 1;i <= a.length;i++) {
      System.out.println("a[" + i + "]�G" + a[i]);
    }
  }
}
