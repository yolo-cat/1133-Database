public class TwoDimArrayAlloc {
  public static void main(String[] argv) {
    int[][] a = new int[3][];

    for(int i = 0;i < a.length;i++)
      a[i] = new int[4]; // �ӧO�t�m��2�����}�C

    System.out.println("a�@�� " + a.length + "�Ӥ����C");

    for(int i = 0;i< a.length;i++) {
      System.out.println("a[" + i + "] �@�� " +
              a[i].length + "�Ӥ����C");
    }
  }
}
