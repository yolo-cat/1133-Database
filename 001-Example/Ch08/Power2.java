import java.util.*;

class Recursive {
   long power(int x, int y) {
    if(y <= 0)   return 1;
    //if(y == 1)   return x;
    if(y%2==0)  // ����O����
      return power(x, y/2)*power(x, y/2);     // �I�s�ۤv
    // ����O�_��
    return x * power(x, y/2) * power(x, y/2); // �I�s�ۤv
  }
}

public class Power2 {
  public static void main(String[] argv) {
    Recursive r = new Recursive();

    Scanner sc = new Scanner(System.in);
    System.out.print("�п�J��� x y (�Ϊťդ��j)�G");
    int x = sc.nextInt(); // �i�s��Ū�J�Ϊťդ��j���Ʀr
    int y = sc.nextInt();

    System.out.println(r.power(x,y));
  }
}