interface Face {   // �w�q Face ����
   void smile(); 
}

public class LambdaFace {
  public static void main(String[] argv) {

    Face c = () -> System.out.print("^_^");  // �� Lambda �B�⦡�إ߰ΦW���O�ò��ͪ���
    c.smile();  // ��X�G^_^
  }
}
