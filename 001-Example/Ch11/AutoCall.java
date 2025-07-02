class Circle {        // ��
  private double x,y; // ���
  private double r;   // �b�|

  public void setCenter(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public void setRadius(double r) {
    this.r = r;
  }

  public String toString() {
    return "��ߡG(" + x + "," + y + "), �b�|�G" + r;
  }

  Circle() {    // �u��ܰT�����غc��k
    System.out.println("...���b���� Circle() �غc��k...");
  }
}

class Cylinder extends Circle { // �~�� Circle ���O
  Cylinder() {  // �u��ܰT�����غc��k
    System.out.println("...���b���� Cylinder() �غc��k...");
  }
}

public class AutoCall {
  public static void main(String[] argv) {
    Cylinder cr = new Cylinder();

    cr.setCenter(3,4);  // �I�s�~�ӦӨӪ���k
    cr.setRadius(5);
    System.out.println(cr.toString());
  }
}
