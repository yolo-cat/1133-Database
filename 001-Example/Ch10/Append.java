public class Append {   
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    StringBuffer b = new StringBuffer(a);
    System.out.println(b.append(20)); // �|���r��
    System.out.println(b.append("�r�ꤺ�e�w�g�ܤF"));
    System.out.println(b.append(b));
  }
}
