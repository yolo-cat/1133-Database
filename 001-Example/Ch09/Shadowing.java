class Test {
  int x = 10,y = 20;

  // �غc��k�ѼƻP�����ܼƦP�W
  Test(int x,int y) {
    this.x = x;
    this.y = y;
  }
}

public class Shadowing {

  public static void main(String[] argv){
    Test a = new Test(30,50);
    System.out.println("�����ܼ�x�G" + a.x);
    System.out.println("�����ܼ�y�G" + a.y);
  }
}