public class SystemOutTest {

  public static void main(String[] argv) {

    int[] a = {10,20,40,80,160};

    // �̧ǿ�X�Ҧ���������ƭȡBASCII �X�������r��
    for(int i = 0;i < a.length;i++) {
      System.out.print("a[" + i + "]�G" + a[i] + " ");
      System.out.write(a[i]);
      System.out.println();     // ����
    }

    byte[] b = {7,32,7,32,7};
    System.err.println("\n���ۿ�X�@����n");
    System.err.write(b, 0, b.length);
  }           // �q�� 0 �Ӥ����}�l��X, �@��X b.length �Ӥ���
}
