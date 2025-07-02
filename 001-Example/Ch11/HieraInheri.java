class Shape {           // �N��ϧέ��I�����O
  protected double x,y; // �y��

  public Shape(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "�ϧέ��I�G(" + x + ", " + y + ")";
  }
}

class Rectangle extends Shape {
  private double w,h;   // �x�Ϊ��e�P��

  public Rectangle(double x,double y,double w, double h) {
    super(x,y);         // �I�s�����O�غc��k
    this.w = w;
    this.h = h;
  }
}

class Circle extends Shape {
  private double r;     // ��Υb�|

  public Circle(double x,double y,double r) {
    super(x,y);         // �I�s�����O�غc��k
    this.r = r;
  }
}

class Cylinder extends Circle {
  private double h;     // ��W����

  public Cylinder(double x,double y,double r,double h) {
    super(x,y,r);       // �I�s�����O�غc��k
    this.h = h;
  }
}

public class HieraInheri {
  public static void main(String[] argv) {
    Rectangle re = new Rectangle(3,6,7,9);
    Circle    ci = new Circle(5,8,7);
    Cylinder  cr = new Cylinder(4,2,6,3);

    System.out.println(re.toString());
    System.out.println(ci.toString());
    System.out.println(cr.toString());
  }
}
