import java.util.*;
import java.io.*;

public class MatchParenthesis {

  public static void main(String args[]) throws IOException {
    System.out.print("�п�J�@�q�⦡�ε{��\n->");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    LinkedList<Character> match = new LinkedList<>();
    try {
      for (int i=0;i<str.length();i++) { // �ΰj��Ū�C�Ӧr��
        if (str.charAt(i)=='(')          // �Y�O���A��
          match.addFirst('(');           // �[�J���X����
        else if (str.charAt(i)==')')     // �Y�O�k�A��
          match.removeFirst();           // �������X���� 1 �ӥ��A��
      }

      if(match.isEmpty())
        System.out.print("���k�A���ƶq�۲�");
      else
        System.out.print("���k�A���ƶq����, �k�A���Ӥ�");

    } catch (NoSuchElementException e) {
        System.out.print("���k�A���ƶq����, ���A���Ӥ�");
    }
  }
}
