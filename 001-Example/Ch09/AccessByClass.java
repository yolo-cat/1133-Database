class Test {
  public int x;            // �ӧO����֦��@��
  public static int y;     // �Ҧ������O����@��

  public Test(int x,int y) {  // �㦳�Ѽƪ��غc��k
    this.x = x;
    this.y = y;
  }

  public String toString() {  // �ন�r��
    return "(x,y):(" + x + "," + y + ")";
  }
}

public class AccessByClass {

  public static void main(String[] argv){
    Test a = new Test(100,40);
    Test b = new Test(200,50);
    Test c = new Test(300,60);
    Test.y = 100;        // �z�L���O�W�٦s�� static ����
    System.out.println("����a" + a);
    System.out.println("����b" + b);
    System.out.println("����c" + c);
  }
}
