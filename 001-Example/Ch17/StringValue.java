public class StringValue {

  public static void main(String args[]) {

    System.out.println("�ܽd valueOf() ���ĪG");

    String str16 = "A035FC4";   // 16 �i����
    String str08 = "1357246";   // 8 �i����
    String str07 = "-162534";   // 7 �i����
    String str02 = "1101101";   // 2 �i����

    System.out.println(str16 + "�G" + Long.valueOf(str16,16));
    System.out.println(str08 + "�G" + Integer.valueOf(str08,8));
    System.out.println(str07 + "�G" + Short.valueOf(str07,7));
    System.out.println(str02 + "�G" + Byte.valueOf(str02,2));
  }
}
