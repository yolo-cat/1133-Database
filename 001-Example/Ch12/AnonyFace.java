interface Face {   // �w�q Face ����
   void smile(); 
}

public class AnonyFace {
  public static void main(String[] argv) {

    // ��@ Face �������ΦW���O, �ëإߪ���Ǧ^���ܼ� c
    Face c = new Face() { 
      public void smile() {  // ��@����������k
        System.out.print("^_^"); 
      }
    };
    c.smile(); // �H c �������ΦW���O����@�� smile() ��k
  }
}
