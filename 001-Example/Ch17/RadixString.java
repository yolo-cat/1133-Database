public class RadixString {

  public static void main(String args[]) {

    System.out.println("�ܽd toXXXString() ��k");

    int i = 496;
    long l = 4388073616521L;

    System.out.println(l + " ��16�i��G" + Long.toHexString(l));
    System.out.println(l + " �� 8�i��G" + Long.toOctalString(l));
    System.out.println(i + " �� 4�i��G" + Integer.toString(i,4));
    System.out.println(i + " �� 2�i��G" + Integer.toBinaryString(i));
  }
}
