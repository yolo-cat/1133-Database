public class NewArray  {
  public static void main(String[] argv) {
    int[] a = {20,30,40};  // �쥻�O 3 �Ӥ������}�C

    System.out.print("�}�Ca�G");
    for(int i : a)   // ��ܰ}�Ca���Ҧ�����
      System.out.print("\t" + i);

    a = new int[5]; // ���s�t�m�}�C
    a[0] = 100;
    a[1] = 200;

    System.out.print("\n���s�t�m�}�Ca�G");
    for(int i : a)   // ��ܰ}�Ca���Ҧ�����
      System.out.print("\t" + i);
  }
}
