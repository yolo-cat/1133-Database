class Test {
  int x,y;

  // �㦳�Ѽƪ��غc��k
  Test(int initX,int initY) {
    x = initX;
    y = initY;
  }
}

public class WithArgument {

  public static void main(String[] argv){
    Test a = new Test(30,40);
    System.out.println("�����ܼ�x�G" + a.x);
    System.out.println("�����ܼ�y�G" + a.y);
  }
}