abstract class Parent { // ��H���O
  abstract void show(); // ��H��k
}

abstract class Child extends Parent { // Parent ���l���O
  // �S����@show�A�۰ʦ�����H���O
}

class Grandson extends Child { // Child ���l���O
  void show() {                // ��@�F��H��k
    System.out.println("�ڦ���@��H��k");
  }
}

public class AbstractChild {
  static public void main(String argv[]) {
    Parent p = new Grandson(); // �إߤl���O������
    p.show();
  }
}
