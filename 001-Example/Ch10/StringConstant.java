public class StringConstant {
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    String b = "�o�O�@�Ӵ��զr��";
    String c = new String("�o�O�@�Ӵ��զr��");

    System.out.println("a == b ?" + (a == b));
    System.out.println("b == c ?" + (b == c));
    System.out.println("a == c ?" + (a == c));
  }
}
