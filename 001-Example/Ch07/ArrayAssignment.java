public class ArrayAssignment  {
  public static void main(String[] argv) {
    int[] a = {20,30,40};
    int[] b = a; // �Na�����e���w��b��

    b[2] = 100; // ���}�Cb�����e

    System.out.print("�}�Ca�������G");
    for(int i : a)   // ��ܰ}�Ca���Ҧ�����
      System.out.print("\t"+i);

    System.out.print("\n�}�Cb�������G");
    for(int i : b)   // ��ܰ}�Cb���Ҧ�����
      System.out.print("\t"+i);
  }
}
