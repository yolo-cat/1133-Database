public class MinMax {

  public static void main(String args[]) {

    System.out.println("Math.min()�BMath.max() �ܽd");
    int i=100;   double a = 0.082;
    int j=37;    double b = 331.39;
    int k=399;   double c = 3.14;

    System.out.println("��Ʋճ̤j���Ʀr�O�G" +
                        Math.max(Math.max(i,j), k));
    System.out.println("�B�I�Ʋճ̤p���Ʀr�O�G" +
                        Math.min(Math.min(a,b), c));
  }
}
