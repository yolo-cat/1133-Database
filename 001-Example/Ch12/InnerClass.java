class Outter {   // �~�����O
  private int i = 1, j = 2; // �����ܼ�
  static int k = 3;         // �R�A�ܼ�

  class Inner {    // �������O
  	int j = 4, k = 5;  // �B�\�F�~���ܼ� j�Bk
  	void print() { 
  	  System.out.print(i);             //�s���~�������ܼ�
  	  System.out.print(Outter.this.j); //�s���Q�B�\���~�������ܼ�
  	  System.out.print(Outter.k);      //�s���Q�B�\���~���R�A�ܼ�
  	  System.out.println(j);           //�s�����������ܼ�
    }
  }
  void callInner() {   // �~�����O����k
    Inner in = new Inner();  // �b�~�����O����k��, �������إߤ�������
    in.print();              // �M��~��Υ��өI�s�������O����k
  }
}

public class InnerClass {
  public static void main(String[] argv) {
  	Outter or = new Outter();         // �إߥ~������
  	or.callInner();                   // �I�s�~�����󪺤�k
  	Outter.Inner ir = or.new Inner(); // �Υ~������إߤ�������
  	ir.print();
  }
}
