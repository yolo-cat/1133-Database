class Test {
  private int x,y; // �������Oprivate

  public Test(int x,int y) {
    this.x = x;
    this.y = y;
  }

  // ����x�Py���s����k
  public int getX() {return x;}
  public void setX(int x) {this.x = x;}
  public int getY() {return y;}
  public void setY(int y) {this.y = y;}
}

public class AccessMethod {

  public static void main(String[] argv){
    Test a = new Test(30,40);

    // �z�L��k��令����
    a.setX(80);
    a.setY(80);

    // �z�L��k���o������
    System.out.println("����x�G" + a.getX());
    System.out.println("����y�G" + a.getX());
  }
}