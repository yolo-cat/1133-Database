
class Outter {
	static class Inner { // �R�A�������O
		int i = 1;
		static int j = 2;     // �R�A�ܼ�
		void print() { System.out.print(i + "," + j); }
		static void add(int x) { j += x; } // �R�A��k
	}
}
public class StaticNested {
  public static void main(String[] argv) {
  	Outter.Inner a = new Outter.Inner(); // �����إ��R�A��������
  	a.i = 3;
  	Outter.Inner.j = 4;   // �H���O�W�٦s���R�A�ܼ�
  	Outter.Inner.add(5);  // �H���O�W�٩I�s�R�A��k
  	a.print();
  }
}
