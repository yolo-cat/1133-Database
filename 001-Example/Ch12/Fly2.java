interface Flyable { // �w�q Flyable ����
	void fly(); // �w�q��k
}

class Bird implements Flyable { // �w�q��@ Flyable ���������O
	public void fly() { // ��@����������k
		System.out.println("�ڹ����ͻH�N�i�H����I");
	}
}

public class Fly2 {
	public static void goHome(Flyable f) {
		f.fly();
	}
	public static void main(String[] argv) {
		Bird b = new Bird();
		goHome(b);
	}
}