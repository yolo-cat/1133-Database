public class ReplaceSubstring { 
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    StringBuffer b = new StringBuffer(a);

    // �R��1�Ӧr��
    System.out.println(b.deleteCharAt(2));
    // ���N2�Ӧr��
    System.out.println(b.replace(1,3,"�n�����O"));
  }
}
