class Land { // �����O
  double area() { // �p�⭱�n
    return 0;
  }
}

class Circle extends Land { // ��Ϊ��g�a
  int r; // �b�|�]���G���ء^

  Circle(int  r) { // �غc��k
    this.r = r;
  }

  double area() { // ���s�w�q������
    return 3.14 * r * r;
  }
}

class Square extends Land { // ����Ϊ��g�a
  int side; // ����]���G���ء^

  Square(int  side) { // �غc��k
    this.side = side;
  }

  double area() { // ���s�w�q������
     return side * side;
  }
}

class Calculator {
  static double calPrice(double price, Land... Lands) {
    double total = 0;  // �[�`�ܼ�

    for(Land l : Lands) {  // �@�@���X�U�Ӫ���
      total += l.area() * price;    // �ӧO�p��ò֥[
    }
    return total;
  }
}

public class Lands4 {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // �@����Ϊ��a
    Square s = new Square(5); // �@������Ϊ��a

    System.out.println("���ȡG" + Calculator.calPrice(4000, c));
    System.out.println("�`���ȡG" + Calculator.calPrice(4000, c, s));
  }
}
