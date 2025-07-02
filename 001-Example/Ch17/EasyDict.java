import java.io.*;
import java.util.*;

public class EasyDict {

  TreeMap<String, String> dict;  // �x�s�r�夺�e

  public EasyDict() throws IOException {
    dict = new TreeMap<>();                // �إ� TreeMap ����
    String enword,chword;                  // �r���ɬ� "dict.txt"
    Reader r = new BufferedReader(new FileReader("dict.txt"));
    StreamTokenizer fr = new StreamTokenizer(r);
                          // �� StreamTokenizer Ū����y�����y�r�šz
                                               // Ū���ɮ׵����e
    while (fr.nextToken()!=StreamTokenizer.TT_EOF) { // ����Ū��
      enword = fr.sval;    // ���o�^���r
      if (fr.nextToken()!=StreamTokenizer.TT_EOF) {
        chword = fr.sval;  // ���o�������
        dict.put(enword,chword);
      }
      else
        break;             // �Y�S��Ū���������������]���X�j��
    }
  }

  public void ask(String str)  {
    if (dict.get(str)!=null)  // �� get() ��k��X���X����������
      System.out.println(str + " ==> " + dict.get(str) + "\n");
    else
      System.out.println("�藍�_, �䤣��o�Ӧr\n");
  }

  public static void main(String args[]) throws IOException {

    EasyDict mydict = new EasyDict();  // �I�s�غc��k

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = new String();

    while(true) {       // �ΰj�����ϥΪ̥i���Ƭd��
      System.out.println("�n�d����^���r");
      System.out.print("(������ Enter �i�����{��)->");
      str = br.readLine();
      if (str.equals(""))   // �Y�S�����e�N���X�j��
        break;
      mydict.ask(str);      // �I�s ask() ��k�ӧ䤤�����
    }
  }
}
