class Test {
  public int x; // �ӧO����֦��@��
  public static int y; // �Ҧ������O����@��

  static { // static��l�϶�
    y = 100;
  }

  // �㦳�Ѽƪ��غc��k
  public Test(int x) {
    this.x = x;
  }

  // �ন�r��
  public String toString() {
    return "(x,y):(" + x + "," + y + ")";
  }
}

public class StaticInit {

  public static void main(String[] argv){
    System.out.println(Test.y);
    Test a = new Test(100);
    Test b = new Test(200);
    Test c = new Test(300);
    System.out.println("����a" + a);
    System.out.println("����b" + b);
    System.out.println("����c" + c);
  }
}
