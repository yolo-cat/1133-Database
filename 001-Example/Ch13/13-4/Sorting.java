abstract class Land implements flag.utility.ICanCompare { // �����O
  abstract double area(); // �p�⭱�n
  public int compare(flag.utility.ICanCompare i) { // ��@compare
    Land l = (Land) i;
    return (int)(this.area() - l.area()); // �̾ڭ��n����j�p
  }
}

class Circle extends Land { // ��Ϊ��g�a
  int r; // �b�|�]���G���ء^

  Circle(int  r) { // �غc��k
    this.r = r;
  }

  double area() { // �h���w�q������
    return 2 * 3.14 * r * r;
  }

  public String toString() {
    return "�b�|�G" + r + ",���n�G" + area() + "����";
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

  public String toString() {
    return "����G" + side + ",���n�G" + area() + "�������";
  }
}

public class Sorting {
        
  public static void main(String[] argv) {
    Land[] Lands = {
      new Circle(5),
      new Square(3),
      new Square(2),
      new Circle(6)
    };

    for(Land l : Lands) {
      System.out.println(l);
    }

    flag.utility.Sort.bubbleSort(Lands);
    System.out.println("�Ƨǫ�...");

    for(Land l : Lands) {
      System.out.println(l);
    }
  }
}
