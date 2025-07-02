import java.util.*;

class Recursive {
  long power(int x,int y) {
    if(y == 0)  // 0 ����Y�Ǧ^ 1
      return 1;
    return x * power(x, y-1);  // �I�s�ۤv�p�� x �� y-1 ����
  }
}

public class Power {
  public static void main(String[] argv) {
    Recursive m = new Recursive();

    Scanner sc = new Scanner(System.in);
    System.out.print("�п�J��� x y (�Ϊťդ��j)�G");
    int x = sc.nextInt(); // �i�s��Ū�J�Ϊťդ��j���Ʀr
    int y = sc.nextInt();

    System.out.println(m.power(x,y));
  }
}