import java.io.*;

public class IdealGas2 {
  public static void main(String[] argv) throws IOException{

    int[] temp = {0,15,20,25};
    System.out.println("�p����� 0,15,20,25 �פU, �z�Q������n");
    System.out.print("�п�J�j�����O (atm)��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // �ഫ�� double
    double pressure = Double.parseDouble(str);
    try {
      if (pressure==0)
        throw new ValueException("�z��J���ȱN�ϰ��Ƭ��s�I");
      else if (pressure<0)
        throw new ValueException("�L�k�p��t�ȡI");

      System.out.println("�b " + pressure + "�j�����U�G");
 
      for (int i=0;i<temp.length;i++) {
        System.out.print("��� " + temp[i] + " �׮�, ");
        System.out.print("�@���ղz�Q������n�� ");
        System.out.print(0.082*(273.14+temp[i])/pressure + " ����\n");
      }                  // �z�Q�����{�� V=nRT/P
    }                
    catch (ValueException e) {
      System.out.println("�o�ͨҥ~�G" + e);	
    }	
  }
}

// �ۭq�ҥ~���O
class ValueException extends RuntimeException {
  public ValueException (String s) {
    super(s);
  }
}