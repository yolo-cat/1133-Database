public class ArrayInitWithExpr {
  public static void main(String[] argv) {
    int i = 4,j = 8;
    int[] a = {4, i, i + j};  // �ϥιB�⦡

    for(int k = 0;k < a.length;k++) {
      System.out.println("a[" + k + "] : " + a[k]);
    }
  }
}
