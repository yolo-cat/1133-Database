class Test {
  public static void print() { // static ��k
    System.out.println("�I�s static ��k");
  }
}

public class StaticMethod {

  public static void main(String[] argv){
    Test.print(); // �z�L���O�W�٩I�s static ��k
    Test a = new Test();
    a.print();    // �z�L����I�s static ��k
  }
}
