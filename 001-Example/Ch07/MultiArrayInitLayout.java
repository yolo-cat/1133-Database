public class MultiArrayInitLayout {
  public static void main(String[] argv) {
    int[][] a = {{1,2,3,4},
                 {5,6,7,8}}; // �ƦC��2X4�}�C���ˤl
    int[][][] b = {{{1,2},
                    {3,4},
                    {5,6}}, // 3X2�}�C
                   {{7,8},
                    {9,10},
                    {11,12}} // 3X2�}�C
                  }; // �ƦC��2X3X2�}�C���ˤl
  }
}
