public class SetCharAt {        
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    StringBuffer b = new StringBuffer(a);

    b.setCharAt(2,'�G');
    System.out.println(b); // �r�ꤺ�e�w�g�ܤF
  }
}
