public class ConditionalExpression  {
  public static void main(String[] argv) {
    int i,j = 17;
    i = (j % 2 == 1) ? 2 : j++ ;
    System.out.println("�ܼ� i �{�b�����e�G" + i);
    System.out.println("�ܼ� j �{�b�����e�G" + j);
  }
}
