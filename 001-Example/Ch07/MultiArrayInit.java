public class MultiArrayInit {
  public static void main(String[] argv) {
    // �����t�m�P�]�w������
    int[][] a = {{1,2,3,4},   // �i�ƦC�� 2x4
                 {5,6,7,8}};  // �������H��K�\Ū

    System.out.println("a�@�� " + a.length + "�Ӥ����C");

    for(int i = 0;i< a.length;i++) {
      System.out.println("a[" + i + "] �@�� " +
              a[i].length + "�Ӥ����C");

      for(int j = 0;j < a[i].length;j++)
        System.out.println(
                "a[" + i + "][" + j +  "] : " + a[i][j]);
    }
  }
}
