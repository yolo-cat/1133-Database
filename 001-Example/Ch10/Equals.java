public class Equals {
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    String b = "�o�O�@�Ӵ��զr��";
    String c = new String("�o�O�@�Ӵ��զr��");

    System.out.println(a.equals(b));
    System.out.println(b.equals(c));
    System.out.println(a.equals(c));
  }
}
