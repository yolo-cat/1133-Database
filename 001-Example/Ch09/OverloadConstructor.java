class Point {
  public int x,y;
  public Point(int x,int y) {
    this.x = x;
    this.y = y;
  }
}

class Rectangle {
  Point upperleft;
  Point lowerright;

  // ���㪩�غc��k
  public Rectangle(Point upperleft,Point lowerright) {
    this.upperleft = upperleft;
    this.lowerright = lowerright;
  }

  // ���ݰѼƪ��غc��k
  public Rectangle() {
     this(new Point(0,0),new Point(5,-5));
  }

  // �������w�y��
  public Rectangle(int x1,int y1,int x2,int y2) {
    this(new Point(x1,y1),new Point(x2,y2));
  }

  // �����
  public Rectangle(Point upperleft,int length) {
     this(upperleft,new Point(upperleft.x + length,
             upperleft.y - length));
  }

  // �p�⭱�n
  public int area() {
    return (lowerright.x - upperleft.x) *
            (upperleft.y - lowerright.y);
  }
}

public class OverloadConstructor {

  public static void main(String[] argv){
    Rectangle a = new Rectangle(0,0,5,-5);
    Rectangle b = new Rectangle(new Point(3,3),4);

    System.out.println("a�����n�G" + a.area());
    System.out.println("b�����n�G" + b.area());
  }
}
