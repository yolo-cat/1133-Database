interface ICanCompare { 
  int compare(ICanCompare i); // �i����
}

class Sort { // ���ѱƧǥ\�઺���O
  static void bubbleSort(ICanCompare[] objs) { // ��w�ƧǪk
    for(int i = objs.length - 1;i > 0;i--) {
      for(int j = 0;j < i;j++) {
        if(objs[j].compare(objs[j + 1]) < 0) {
          ICanCompare temp = objs[j];
          objs[j] = objs[j + 1];
          objs[j + 1] = temp;
        }
      }
    }
  }
}

abstract class Land implements ICanCompare { // �����O
  abstract double area(); // �p�⭱�n
  public int compare(ICanCompare i) { // ��@compare
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
    return 3.14 * r * r;
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
    Land[] lands = {
      new Circle(5),
      new Square(3),
      new Square(2),
      new Circle(4)
    };

    for(Land l : lands) {
      System.out.println(l);
    }

    Sort.bubbleSort(lands);
    System.out.println("�Ƨǫ�...");

    for(Land l : lands) {
      System.out.println(l);
    }
  }
}
