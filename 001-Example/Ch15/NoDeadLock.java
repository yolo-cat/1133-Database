class ThreadA extends Thread {
  public void run() {
    Lock.obj.a();
  }
}

class ThreadB extends Thread {
  public void run() {
    Lock.obj.b();
  }
}

class Lock {
  public static Lock obj = new Lock();
  private boolean bExecuted = false;

  public synchronized void a() {
    System.out.println("��ka�}�l����");
    while(!bExecuted) {} // ����kb�Q�s��
    System.out.println("��ka���槹��");
  }

  public void b() {
    System.out.println("��kb�}�l����");
    bExecuted = true; // ��ܤ�kb�w�g�s�ΤF
    System.out.println("��kb���槹��");
  }
}

public class NoDeadLock {
  public static void main(String[] argv) {
    ThreadA a = new ThreadA();
    ThreadB b = new ThreadB();
    try {
      a.start(); // a�����������
      b.start(); // b������A���۰���
      a.join(); // ��a���������
      b.join(); // ��b���������
    } catch(InterruptedException e) {}
    System.out.println("�{������");
  }
}
