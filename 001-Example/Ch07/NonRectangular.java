public class NonRectangular {
  public static void main(String[] argv) {
    int[][] a = new int[3][];

    a[0] = new int[2]; // ��2�Ӥ���
    a[1] = new int[4]; // ��4�Ӥ���
    a[2] = new int[3]; // ��3�Ӥ���

    System.out.println("a�@�� " + a.length + "�Ӥ����C");

    for(int i = 0;i< a.length;i++) {
      System.out.println("a[" + i + "] �@�� " +
              a[i].length + "�Ӥ����C");
    }
  }
}
