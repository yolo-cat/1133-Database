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

  Circle(double x,double y,double r) {  // Circle ���غc��k
    this.x = x;
    this.y = y;
    this.r = r;
  }

  public String toString() {     // ��ܸ�T
    return "��ߡG(" + x + "," + y + "), �b�|�G" + r;
  }
}

class Cylinder extends Circle {
  private double h;

  Cylinder(double x,double y,double r,double h) {
    super(x,y,r);                // �I�s�����O�غc��k
    this.h = h;
  }
}

public class UsingSuper {
  public static void main(String[] argv) {
    Cylinder cr = new Cylinder(1,2,3,4);
    System.out.println(cr.toString());
  }
}
