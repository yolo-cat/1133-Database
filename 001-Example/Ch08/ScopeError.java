public class ScopeError {
  public static void main(String[] argv){
    int x = 1;
    {
      int y = 20; int z = 40;
      {
        int z = 300;

        System.out.println("x = " + x); // �̥~�h��x
        System.out.println("y = " + y); // �W�@�h��y
        System.out.println("z = " + z);
        System.out.println("");
      }


      System.out.println("x = " + x); // �̥~�h��x
      System.out.println("y = " + y);
      System.out.println("z = " + z);
      System.out.println("");
    }

    int y = 2;
    int z = 3;
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
  }
}