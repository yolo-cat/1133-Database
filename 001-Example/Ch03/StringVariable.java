public class StringVariable  {
  public static void main(String[] argv) {
     String s1= "�Ĥ@�Ӧr��";
     String s2= "�ĤG��\t�r��"; // �r�ꤤ�i�ϥθ���ǦC
     
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s1 + '\n' + s2); // �r��]�i�P�r���ۥ[
  }
}