class TestA { // �������O
  int x = 3;  // �]�w��l��

  void show() {
    System.out.println("x = " + x);
  }
}

class TestB {
  void changeTestA(TestA t,int newX) {
    t.x = newX; // �z�L�ѷӭק磌�󤺮e
  }
}

public class PassReference {
  public static void main(String[] argv){
    TestA a = new TestA();
    TestB b = new TestB();

    a.show();
    b.changeTestA(a,20); // �ǤJ����ѷ�
    a.show();
  }
}
