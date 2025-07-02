class Point {
	public int x; // x�y��
	public int y; // y�y��
	
	public Point(int x,int y) { // �غc��k
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) { // �غc��k
		this.x = p.x;
		this.y = p.y;
	}
	
	public String toString() { // �ন�r��
		return x + "," + y;
	}
}

class Test {
	private Point pos; // private ����
	
	public Test(Point p) { // ����Point����
		pos = new Point(p);
	}
	
	// ����x�Py���s����k
	public Point getPos() {return new Point(pos);}
	public void setPos(Point p) {
		this.pos.x = p.x;
		this.pos.y = p.y;
	}
}

public class ReturnObject {

	public static void main(String[] argv){
		Test a = new Test(new Point(30,40));
		
		// �z�L��k��令����
		a.setPos(new Point(80,80));
		
		// �z�L��k���o������
		System.out.println("��m�G" + a.getPos());
	}
}
