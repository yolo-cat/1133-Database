import java.io.*;

class AccountError extends Exception { // �ۭq���ҥ~���O
  public AccountError(String message) { super(message); }
}

class Account  {         // ²�檺�b�����O
  private long  balance; // �O���b��l�B

  public Account(long money)  { balance = money; }

  // �s�ڪ���k
  public void deposite(long money) throws AccountError {
    if (money <0)
      throw new AccountError("�s�ڪ��B���i���t��");  // �ߥX�ҥ~
    else
      balance += money;
  }

  // ���ڪ���k
  public void withdraw(long money) throws AccountError {
    if (money > balance)
      throw new AccountError("�s�ڤ���");  // �ߥX�ҥ~
    else
      balance -= money;
  }

  public long checkBalance() { return balance; }  // �Ǧ^�l�B
}

public class TestAccount {

  public static void main(String[] argv) throws IOException {

    System.out.println("²��b������p��");
    System.out.println("�}��n���s100��");
    Account myAccount = new Account(100);

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str;

    try {
      while (true) { // �s�B���ڪ��j��
        System.out.print("\n�z�{�b�n(1)�s��(2)���ڡ�");
        str = br.readLine();
        int choice = Integer.parseInt(str);
        System.out.print("�п�J���B��");
        str = br.readLine();
        int money = Integer.parseInt(str);

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
