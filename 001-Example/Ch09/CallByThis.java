class Test {
  int x = 10,y = 20;

  // �㦳�Ѽƪ��غc��k
  Test(int x,int y) {
    this(x); // �I�s�t�@�ӫغc��k
    this.y = y;
  }

  Test(int x) {
          this.x = x;
  }
}

public class CallByThis {

  public static void main(String[] argv){
    Test a = new Test(30,50);
    System.out.println("����x�G" + a.x);
    System.out.println("����y�G" + a.y);
  }
}