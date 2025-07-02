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

  double area() { // �h���w�q������
    return 3.14 * r * r;
  }
}

class Square extends Land { // ����Ϊ��g�a
  int side; // ����]���G���ء^

  Square(int  side) { // �غc��k
    this.side = side;
  }

  double area() { // �h���w�q������
    return side * side;
  }
}

class Calculator {
  double price; // �C���褽�ت�����]���^

  Calculator(double price) { // �غc��k
    this.price = price;
  }

  double calculatePrice(Land l) {
    return l.area() * price; // �z�L�h�ΩI�s���T�� area() ��k
  }

  double calculateAllPrices(Land[] Lands) {
    double total = 0; // �p��[�`

    for(Land l : Lands) { // �@�@���X�U�Ӫ���
      total += calculatePrice(l); // �ӧO�p��ò֥[
    }

    return total;
  }
}

public class Lands2 {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // �@����Ϊ��a
    Square s = new Square(5); // �@������Ϊ��a

    Calculator ca = new Calculator(3000.0); // �C���褽��3000��

    System.out.println("�`���ȡG" + // �ϥΰΦW�}�C
      ca.calculateAllPrices(new Land[] {c,s}));
  }
}
