public class TestFinally {

  public static void main(String[] argv) {

    int[] a = {10,20,30,40};

    try {
      // �G�N�[�H�U���ԭz, �H���� ArithmeticException �ҥ~
      int i=0;
      i = 100/i;

      for(int j = 0;j <= a.length;j++)
        System.out.println("a[" + j + "]�G" + a[j]);
    }
    catch (IndexOutOfBoundsException e) {

      System.out.println("�o�ͨҥ~�G" + e );
      System.out.println("�]�N�O�W�X�}�C�d��F!");
    }
    finally {
      System.out.println("���צp��o��{�����|�Q����I");
    }

    System.out.println("�o�椣�@�w�|�Q����I");
  }
}