class Test {
  int x = 10,y = 20;

  // ��ӰѼƪ��غc��k
  Test(int initX,int initY) {
    x = initX;
    y = initY;
  }

  // �@�ӰѼƪ��غc��k
  Test(int initX) {
    x = initX;
  }

  // ����Ѽƪ��غc��k
  Test() {
  }

  void show() { // ��ܦ����ܼƪ���k
    System.out.println("�����ܼ�x�G" + x);
    System.out.println("�����ܼ�y�G" + y);
  }
}

public class Overloading {

  public static void main(String[] argv){
    Test a = new Test(30,50);
    Test b = new Test(60);
    Test c = new Test();

    a.show();
    b.show();
    c.show();
  }
}