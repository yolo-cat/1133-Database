interface TimesUp { 
  void notifyMe(); // �q���ɶ��w��
}

class Timer { // �������X��
  static void startTimer(int seconds,TimesUp obj) {
    // �}�l�p��
    for(int i = 0;i < seconds;i++);
    obj.notifyMe(); // �q���X��ϥΪ�
  }
}

class watchUser implements TimesUp {
  public void notifyMe() {
     System.out.println("�ɶ���");
  }
}

public class Stopwatch {

  public static void main(String[] argv) {
    watchUser w = new watchUser();
    Timer.startTimer(1000,w);
  }
}
