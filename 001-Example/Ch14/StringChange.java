import java.util.*;

public class StringChange {

  public static void main(String[] argv) {

    System.out.println("���{���|�N�r�ꤤ���^��r���j�p�g����");
    System.out.print("�п�J�n�ഫ���r��(��J bye ����)��");

    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      String str = sc.nextLine();
      if(str.equalsIgnoreCase("bye"))
        break;         // ��J "bye" �Y�����j��

      char[] temp = str.toCharArray();  // �N�r���ন�r���}�C

      try {
        for (int i=0;i<temp.length;i++)
          if (Character.isLetter(temp[i]) |
              Character.isWhitespace(temp[i]))
             if (Character.isLowerCase(temp[i]) )
               temp[i] = Character.toUpperCase(temp[i]);
             else
               temp[i] = Character.toLowerCase(temp[i]);
          else       // �J��D�^��r��, �Y�ߥX�ҥ~
            throw new RuntimeException();
        System.out.println(temp);
      }
      catch (RuntimeException e) {
        System.out.println("�r�ꤤ�u��t�^��r��");
      }
      finally {
        System.out.print("\n�п�J�n�ഫ���r��");
        System.out.print("(��J bye ����)��");
      }
    }
  }
}
