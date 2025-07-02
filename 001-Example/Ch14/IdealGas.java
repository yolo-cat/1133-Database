import java.io.*;

public class IdealGas {

  public static void main(String[] argv) throws IOException{

    int[] temp = {0,15,20,25};
    System.out.println("�p����� 0,15,20,25 �פU, �z�Q������n");
    System.out.print("�п�J�j�����O (atm)��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // �ഫ�� double
    double pressure = Double.parseDouble(str);

    if (pressure==0)
      throw new ArithmeticException("�z��J���ȱN�ϰ��Ƭ��s�I");

    System.out.println("�b " + pressure + "�j�����U�G");

    for (int i=0;i<temp.length;i++) {
      System.out.print("��� " + temp[i] + " �׮�, ");
      System.out.print("�@���ղz�Q������n�� ");
      System.out.print(0.082*(273.14+temp[i])/pressure + " ����\n");
    }                // �z�Q�����{�� V=nRT/P
  }
}