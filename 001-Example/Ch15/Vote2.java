class PollingStation extends Thread { // �}����
  static int reportTimes = 5; // �^������
  int total = 0; // ���}�����`����
  Vote2 v; // Vote2����
  String name; // �}���ҦW��

  public PollingStation(Vote2 v,String name) { // �غc��k
    this.v = v; // �O��Vote2����
    this.name = name; // �O���}���ҦW��
  }

  public void run() { // ������n�i��u�@
    for(int i = 0;i < reportTimes;i++) {
      //�H�üƲ��ͷs�W�o����
      int count = (int)(Math.random() * 500);
      v.reportCount(name,count); // �^���s�W�o���ƨå[�`
      total += count; // ���}���ҥ[�`
    }
  }
}

public class Vote2 {
  private int total = 0; // �`�}����
  private int numOfStations = 2; // �}���Ҽ�
  private PollingStation[] stations;

  public void reportCount(String name, int count) {

    synchronized(this) {
      int temp = total;

      System.out.println(name + "�}���ұo" + count + "��");
      temp = temp + count;
      System.out.println("�ثe�`���ơG" + temp);
      total = temp;
    }
  }

  public void startReport() {
    // �إ߰}�C
    stations = new PollingStation[numOfStations];

    // �@�@�إߧ벼�Ҫ���A�åB����
    for(int i = 1;i <= numOfStations;i++) {
       stations[i - 1] = new PollingStation(this,i + "��");
    }

    // �@�@�Ұʰ����
    for(int i = 0;i < numOfStations;i++) {
       stations[i].start();
    }

    // �@�@���ݧ벼�Ҷ}������
    for(int i = 0;i < numOfStations;i++) {
      try {
         stations[i].join();
      } catch(InterruptedException e) {}
    }

    System.out.println("�̫�벼���G�G");

    // �@�@��ܦU�벼�Ҳ���
    for(int i = 0;i < numOfStations;i++) {
      System.out.println(stations[i].name + ":" +
              stations[i].total);
    }

    // ��̫ܳ��`����
    System.out.println("�`���ơG" + total);
  }

  public static void main(String[] argv) {
    Vote2 v = new Vote2();
    v.startReport();
  }
}