class Test {

  // 1�������G�ϥμe�P��
  int rectangleArea(int width,int height) {
    return width * height;
  }

  // 2�������G�ϥήy��
  int rectangleArea(int bottom,int left,int top,int right) {
    return (right - left) * (top - bottom);
  }
}

public class Overloading {

  public static void main(String[] argv){
    Test a = new Test();
    int area;

    area = a.rectangleArea(10,20);
    System.out.println("�x�έ��n�G" + area);

    area = a.rectangleArea(5,5,15,25);
    System.out.println("�x�έ��n�G" + area);
  }
}