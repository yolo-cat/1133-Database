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

  public synchronized void b() {
    System.out.println("��kb�}�l����");
    bExecuted = true; // ��ܤ�kb�w�g�s�ΤF
    System.out.println("��kb���槹��");
  }
}

public class DeadLock {
  public static void main(String[] argv) {
    ThreadA ta = new ThreadA();
    ThreadB tb = new ThreadB();
    try {
      ta.start(); // ta�����������
      tb.start(); // tb������A���۰���
      ta.join(); // ��ta���������
      tb.join(); // ��tb���������
    } catch(InterruptedException e) {}
    System.out.println("�{������");
  }
}