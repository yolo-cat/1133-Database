import java.util.*;

public class RegExTest {

  public static void main(String[] argv)  {
    Scanner sc = new Scanner(System.in);

    String pat; // �O���ϥΪ̿�J�˦�
    String str; // �O���ϥΪ̿�J���զr��

    System.out.print("�п�J�˦��G");
    pat = sc.next(); // Ū���˦�

    System.out.print("�п�J�r��G");
    str = sc.next(); // Ū���r��

    if(str.matches(pat))    // �i����
      System.out.println("�۲�");
    else
      System.out.println("���۲�");
  }
}
