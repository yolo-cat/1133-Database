class Test {
  public int x;        // �ӧO����֦��@��
  public static int y; // �Ҧ������O����@��

  public Test(int x) { // �غc��k�u�]�w x ����
    this.x = x;
  }

  public String toString() {  // �ন�r��
    return "(x,y):(" + x + "," + y + ")";
  }
}

public class ClassVar {

  public static void main(String[] argv){
    Test.y = 100;      // �|���إߪ���Y�s�� static �����ܼ�
    Test a = new Test(100);
    Test b = new Test(200);
    Test c = new Test(300);
    System.out.println("����a" + a);
    System.out.println("����b" + b);
    System.out.println("����c" + c);
  }
}
