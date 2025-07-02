
class Point {    // �I
  private double x,y;

  public void setX(double x) { this.x = x; }
  public void setY(double y) { this.y = y; }

  public String toString() {   // �N�����T�ন�r�ꪺ��k
    return "(" + x + "," + y + ")";
  }

  public Point(double x, double y) {   // �غc��k
    this.x = x; this.y = y; 
  }
  
  public Point(Point p) { // �Υt�@���󰵬���Ȫ��غc��k
    x = p.x;
    y = p.y;
  }
}

class Circle {       // ��
  private Point p;   // ���
  private double r;  // �b�|

  public Point getP() {
    return new Point(p);    // �إߤ@�ӷs�� Point ����Ǧ^
  }

  public String toString() {   // �N�����T�ন�r�ꪺ��k
    return "��ߡG" + p.toString() + " �b�|�G" + r;
  }

  Circle(double x,double y,double r) {   // �غc��k
    p = new Point(x,y);
    this.r = r;
  }
}

public class HidePrivateMember {
  public static void main(String[] argv) {
    Circle c = new Circle(3,4,5);  // ��� (3,4), �b�| 5

    Point p = c.getP(); // ���o�N���ߪ��I����
    p.setX(6);                     // �ܧ��߮y��
    System.out.println(c.toString());
  }
}