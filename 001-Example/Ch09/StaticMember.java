class Test {
	public int x; // �ӧO����֦��@��
	public static int y; // �Ҧ������O����@��
	
	// �㦳�Ѽƪ��غc��k
	public Test(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	// �ন�r��
	public String toString() {
		return "(x,y):(" + x + "," + y + ")";
	}
}

public class StaticMember {

	public static void main(String[] argv){
		Test a = new Test(100,40);
		Test b = new Test(200,50);
		Test c = new Test(300,60);
		System.out.println("����a" + a);
		System.out.println("����b" + b);
		System.out.println("����c" + c);
	}
}