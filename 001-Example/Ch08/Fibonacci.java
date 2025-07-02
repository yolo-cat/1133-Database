import java.io.*;

class Mathematics {
  long fibonacci(int n) {
    if(n <= 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}

public class Fibonacci {

  public static void main(String[] argv) throws IOException{
    Mathematics m = new Mathematics();

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J n�G");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Fibonacci �ƦC�� " + n + " ���G" +
      m.fibonacci(n));
  }
}