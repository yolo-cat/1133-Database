import java.util.Date;

public class TestTimer implements TimeUp {
  static boolean isTimeUp = false;

  public static void main(String[] argv) {
    Timer.setTimer(5000,new TestTimer());

    Date now = new Date();
    System.out.println("�ثe�ɨ�G" + now);
    while(!isTimeUp) {
      try {
        Thread.sleep(1000);
      } catch(InterruptedException e) {}
      System.out.print(".");
    }
    now = new Date();
    System.out.println("�ثe�ɨ�G" + now);
  }

  public void notifyTimeUp() {
    System.out.println("�ɶ���I");
    isTimeUp = true;
  }
}
