class Test {
  int x,y;

  // ����Ѽƪ��غc��k
  Test() {
    x = 10;
    y = 20;
  }
}

public class NoArgument {

  public static void main(String[] argv){
    Test a = new Test();
    System.out.println("�����ܼ�x�G" + a.x);
    System.out.println("�����ܼ�y�G" + a.y);
  }
}