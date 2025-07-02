public class Timer extends Thread {
  private int interval; // �p�ɰ϶�
  private TimeUp listener; // �ɶ���ɤϦV�s�Ϊ�����

  public static void setTimer(int interval,TimeUp listener) {
    Timer t = new Timer(interval,listener); // �إ߭p�ɪ���
    t.start(); // �Ұʭp�ɥΪ������
  }

  private Timer(int interval,TimeUp listener) {
    this.interval = interval;
    this.listener = listener;
  }

  public void run() {
    try {
      sleep(interval); // �i�J�ίv�ɶ����ݮɶ���
    } catch(InterruptedException e) {}
    listener.notifyTimeUp(); // �q���ɶ��w��
  }
}
