import java.util.Date;

class TimerThread implements Runnable { // �HRunnable�����إ߰����
  public void run() { // �s������n���檺���e
    while(true) { // ���_��ܤ���ɶ����j�����
      for(int i = 0;i < 50_000_000;i++); // ���ݤ@�q�ɶ�
      Date now = new Date(); // ���o�ثe�ɶ�
      System.out.println("�s�����:" + now); // ��ܮɶ�
    }
  }
}

public class TestRunnable {
        
  public static void main(String[] argv) {
    // �s�������
    Thread newThread = new Thread(new TimerThread());
    newThread.start(); // �Ұʷs�����
    while(true) { // ���_��ܤ���ɶ����j��
      for(int i = 0;i< 50_000_000;i++); // ���ݤ@�q�ɶ�
      Date now = new Date(); // ���o�ثe�ɶ�
      System.out.println("�°�����G" + now); // ��ܮɶ�
    }
  }
}
