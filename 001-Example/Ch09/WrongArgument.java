class Test {
	int x,y;
	
	// �㦳�Ѽƪ��غc��k
	Test(int initX,int initY) { // �ݭn2�ӰѼ�
		x = initX;
		y = initY;
	}
}

public class WrongArgument {

	public static void main(String[] argv){
		Test a = new Test(30); // ��1�ӰѼ�
		System.out.println("����x�G" + a.x);
		System.out.println("����y�G" + a.y);
	}
}