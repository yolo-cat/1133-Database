public class ConditionPromotion  {
  public static void main(String[] argv) {
    byte b = 1;
    int i = 2;
    b = (i == 2) ? b : i;
    System.out.println("�ܼ� i �{�b�����e�G" + i);
    System.out.println("�ܼ� b �{�b�����e�G" + b);
  }
}
