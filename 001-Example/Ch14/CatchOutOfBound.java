public class CatchOutOfBound {

  public static void main(String[] argv) {

    int[] a = {10,20,30,40};

    try {
      // �N�i��޵o���~���{����b try ���j�A����
      for(int i = 0;i <= a.length;i++)
        System.out.println("a[" + i + "]�G" + a[i]);
    } catch (ArrayIndexOutOfBoundsException e) {
    // �o�� ArrayIndexOutOfBoundsException �ҥ~��,
    // �~�|���榹�j�A�������{���X

      System.out.println("�o�ͨҥ~�G" + e);
      System.out.println("�]�N�O�W�X�}�C�d��F!");
    }

    System.out.println("�o��{���٬O�|�Q����I");
  }
}
