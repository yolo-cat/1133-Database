import java.io.*;

class AccountError extends Exception { // �ۭq���ҥ~���O
  public AccountError(String message) { super(message); }
}

class Account implements Serializable {
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
