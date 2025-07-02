interface surfacing {
  double area();        // �p�⭱�n����k
}

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

class Circle extends Shape implements surfacing {
  private double r;     // ��Υb�|
  final static double PI = 3.14159;

  public Circle(double x,double y,double r) {
    super(x,y);         // �I�s�����O�غc��k
    this.r = r;
  }

  public double area() {// �p��ꭱ�n
    return PI*r*r;
  }

  public String toString() {
    return "��ߡG(" + x + ", " + y + ")�B�b�|�G" + r + 
           "�B���n�G" + area();
  }
}

public class ShapeArea {
  public static void main(String[] argv) {
    Circle c = new Circle(5,8,7);
    System.out.println(c.toString());
  }
}
