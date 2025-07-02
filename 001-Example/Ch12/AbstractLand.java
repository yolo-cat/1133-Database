abstract class Land {     // �����O
  abstract double area(); // �p�⭱�n
}

class Circle extends Land { // ��Ϊ��g�a
  int r; // �b�|�]���G���ء^

  Circle(int  r) { // �غc��k
    this.r = r;
  }

  double area() {  // ��@��H��k (�]�N�O���s�w�q�����O������k)
    return 2 * 3.14 * r * r;
  }
}

class Square extends Land { // ����Ϊ��g�a
  int side; // ����]���G���ء^

  Square(int side) { // �غc��k
    this.side = side;
  }

  double area() {     // ��@��H��k (�]�N�O���s�w�q�����O������k)
    return side * side;
  }
}

class Calculator {
  static double calPrice(double price, Object... objs) {
    double total = 0;  // �Ψ��x�s�`��
    double tmp = 0;    // �Ȧs��@���a��

    for(Object o : objs) {   // �@�@���X�U�Ӫ���
    
      if(o instanceof Land) {            // �p�G�O�g�a����
      	tmp = ((Land)o).area() * price;  // �p��a��, �x�s�� tmp ��
        total += tmp;                    // �֥[�_��
      }
      
      else if(o instanceof Integer) {    // �_�h�p�G�O�ƭ�
      	total += tmp * ((Integer)o - 1); // �]���e tmp �w�[�L�@��, �ҥH�� 1
      }
    }
    return total;
  }
}

public class AbstractLand {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // �@����Ϊ��a
    Square s = new Square(5); // �@������Ϊ��a

    System.out.println("���ȡG" + Calculator.calPrice(4000, c));
    System.out.println("�`���ȡG" + Calculator.calPrice(4000, c, s));
    System.out.println("�`���ȡG" + Calculator.calPrice(3000, s, 2, c));
  }
}
