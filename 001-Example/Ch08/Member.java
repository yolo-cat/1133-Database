class Test {
  int x = 10;

  void show(){
    System.out.println("x = " + x);
    System.out.println("y = " + y);
  }

  int y = 20;        // �ŧi�b��k���᪺�����ܼ�
}

public class Member {

  public static void main(String[] argv){
    Test a = new Test();
    a.show();
  }
}