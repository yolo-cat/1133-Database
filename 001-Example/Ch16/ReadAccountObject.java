import java.io.*;

public class ReadAccountObject {

  public static void main(String[] argv)
                throws IOException, ClassNotFoundException {
    System.out.println("���ɮ�Ū���b���T");

    ObjectInputStream ois =                 // �إߪ����J��y
      new ObjectInputStream(new FileInputStream("AccountFile"));
    Account myAccount = (Account) ois.readObject();  // Ū�J�b�᪫��
    ois.close();                            // ������y

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    try {
      while (true) { // �s�B���ڪ��j��
        System.out.print("\n�z�{�b�n(1)�s��(2)���ڡ�");
        int choice = Integer.parseInt(br.readLine());
        System.out.print("�п�J���B��");
        int money = Integer.parseInt(br.readLine());

        if(choice == 1) {       // �s�ڳB�z
          myAccount.deposite(money);
          System.out.print("�s�F" + money + " ����, �b���ٳ� ");
          System.out.println(myAccount.checkBalance() + " ��");
        }
        else if(choice == 2) {  // ���ڳB�z
          myAccount.withdraw(money);
          System.out.print("��F" + money + " ����, �b���ٳ� ");
          System.out.println(myAccount.checkBalance() + " ��");
        }
      }  // �j�鵲��
    }
    catch (AccountError e) {
      System.out.println(e);
    }
  }
}
