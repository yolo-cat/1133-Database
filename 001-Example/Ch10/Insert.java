public class Insert {   
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    StringBuffer b = new StringBuffer(a);

    System.out.println(b.insert(0,20)); // ���J��̶}�Y
    System.out.println(b.insert(3,"�r�ꤺ�e�w�g�ܤF"));

    // ���J����ݡA����append()
    System.out.println(b.insert(b.length(),b));
  }
}
