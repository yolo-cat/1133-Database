import java.util.Date;

class TimerThread extends Thread { // �s�������
  public void run() { // �s������n���檺���e
    while(true) {     // ���_��ܤ���ɶ����j��
      for(int i = 0;i < 50_000_000;i++); // ���ݤ@�q�ɶ�
      Date now = new Date(); // ���o�ثe�ɶ�
      System.out.println("�s������G" + now); // ��ܮɶ�
    }
  }
}

public class TestThread {
        
  public static void main(String[] argv) {
    TimerThread newThread = new TimerThread();
    newThread.start(); // �Ұʰ����
    while(true) {      // ���_��ܤ���ɶ����j��
      for(int i = 0;i< 50_000_000;i++); // ���ݤ@�q�ɶ�
      Date now = new Date(); // ���o�ثe�ɶ�
      System.out.println("�°�����G" + now); // ��ܮɶ�
    }
  }
}
