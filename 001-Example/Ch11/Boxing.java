class Child extends Object {
   int addTwoInteger(Integer i1,Integer i2) { // �۰ʫʽc
     return i1 + i2; // �۰ʩ�c
   }
}

public class Boxing {
        
  public static void main(String[] argv) {
    Child c = new Child(); // ����Child����

    System.out.println(c.addTwoInteger(10,20));
    System.out.println(c.addTwoInteger(
      new Integer(10),new Integer(20))); // �إ� 2 �� Interger ����
  }
}
