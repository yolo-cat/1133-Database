import java.util.*;

class Compute {
  long factorial(int x) { // �H���j�p�ⶥ��
    if(x == 0) return 1;

    // �I�s�ۤv�p�� (x-1)!
    return x * factorial(x - 1);
  }
}

public class Factorial {

  public static void main(String[] argv)  {
    Compute c = new Compute();

    System.out.print("�p�� x!, �п�J x->");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    System.out.println(x + "! = " + c.factorial(x));
  }
}
