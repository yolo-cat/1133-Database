public class Delete {   
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    StringBuffer b = new StringBuffer(a);

    System.out.println(b.delete(1,2)); // �R��1�Ӧr��
    System.out.println(b.delete(0,3)); // �R��3�Ӧr��
  }
}
