class Test { // �������O
  int x = 3; // �]�w��l��

  void show() {
    System.out.println("x = " + x);
  }
}

public class Unique {

  public static void main(String[] argv){
    Test a,b,c;

    a = new Test();  // �إ� 2 �Ӫ���ð����
    b = new Test();
    System.out.println("a == b ? " + (a == b));

    c = b;           // �� c �M b �ѷӨ�P�@����
    c.x = 10;
    System.out.println("c == b ? " + (c == b));
    System.out.print("a.");
    a.show();
    System.out.print("b.");
    b.show();
    System.out.print("c.");
    c.show();
  }
}