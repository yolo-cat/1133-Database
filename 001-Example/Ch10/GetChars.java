public class GetChars { 
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    char[] chars = new char[4];
    a.getChars(1,5,chars,0);
    System.out.println(new String(chars));
  }
}