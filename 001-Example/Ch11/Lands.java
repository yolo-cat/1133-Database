class Circle { // ��Ϊ��g�a
  int r; // �b�|�]���G���ء^

  Circle(int  r) { // �غc��k
    this.r = r;
  }

  double area() {
    return 3.14 * r * r;
  }
}

class Square{ // ����Ϊ��g�a
  int side; // ����]���G���ء^

  Square(int  side) { // �غc��k
    this.side = side;
  }

  double area() {
    return side * side;
  }
}

class Calculator {
  double price; // �C���褽�ت�����]���^

  Calculator(double price) { // �غc��k
    this.price = price;
  }

  double calculatePrice(Circle c) { // �h���w�q
    return c.area() * price;
  }

  double calculatePrice(Square s) { // �h���w�q
    return s.area() * price;
  }
}

public class Lands {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // �@����Ϊ��a
    Square s = new Square(5); // �@������Ϊ��a

    Calculator ca = new Calculator(3000.0); // �C���褽��3000��

    System.out.println("c �o���a��" + ca.calculatePrice(c));
    System.out.println("s �o���a��" + ca.calculatePrice(s));
  }
}
