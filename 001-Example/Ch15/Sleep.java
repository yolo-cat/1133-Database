import java.util.Date;

class TimerThread extends Thread { // �s�������
  public void run() { // �s������n���檺���e
    try {
      while(true) { // ���_����
        sleep(1000); // �ίv�@����
        Date now = new Date(); // ���o�ثe�ɶ�
        System.out.println("�s�����:" + now); // ��ܮɶ�
      }
    }
    catch(InterruptedException e) {}
  }
}

public class Sleep {
        
  public static void main(String[] argv) {
    TimerThread newThread = new TimerThread(); // �إ߰����
    newThread.start(); // �Ұʷs�����
    try {
      while(true) { // ���_����
        Thread.sleep(1000); // �ίv1����
        Date now = new Date(); // ���o�ثe�ɶ�
        System.out.println("�°�����G" + now); // ��ܮɶ�
      }
    }
    catch(InterruptedException e) {}
  }
}