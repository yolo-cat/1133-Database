public class ConstructString {

  public static void main(String[] argv) {

    char[] test = {'�o','�O','��','��','��','�r','��'};
    String a = new String();         // ""
    String b = new String(test);     // "�o�O�Ӵ��զr��"
    String c = new String(test,3,4); // "���զr��"
    String d = new String(b);        // "�o�O�Ӵ��զr��"

    System.out.println("a�G" + a);
    System.out.println("b�G" + b);
    System.out.println("c�G" + c);
    System.out.println("d�G" + d);

    // d �O b ���ƥ�
    System.out.println("b == d ?" + (b == d));
  }
}
