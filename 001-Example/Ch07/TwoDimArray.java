public class TwoDimArray {
  public static void main(String[] argv) {
    int[][] a = new int[3][4]; // �ŧi2���}�C�ðt�m�Ŷ�

    System.out.println("a�@�� " + a.length + "�Ӥ����C");

    for(int i = 0;i< a.length;i++) {
      System.out.println("a[" + i + "] �@�� " +
              a[i].length + "�Ӥ����C");
    }
  }
}
