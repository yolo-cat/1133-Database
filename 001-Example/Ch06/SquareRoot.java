import java.io.*;
import java.util.*;

public class SquareRoot {

  public static void main(String args[]) throws IOException {
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

//    do{
      System.out.print("�n�D����ƪ�����ڡG");

      String str = br.readLine();
      int num = Integer.parseInt(str);
      double guess=num, root;

      do {
        root = (num/guess + guess) / 2.0;
        //root = guess - guess/2;
        System.out.println("root=" + root +"  guess=" + guess );
        if(root<0) root=-root;
        if( (guess-root) < 0.00001)
          break;
        guess = root;
      } while (true);
      System.out.println(num + "����ڬ�" + root );

     Calendar c = Calendar.getInstance();
     c.set(2013,4,1);
     //c.get(Calendar.DAY_OF_WEEK);
     System.out.println(c.get(Calendar.DAY_OF_WEEK) );

  }
}

