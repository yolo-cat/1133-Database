public class Associativity {
  public static void main(String[] argv) {
    int i = 8 / 2 / 2; // -> (8 / 2) / 2
    System.out.println("�ܼ� i �{�b�����e�G" + i);
    
    i = 99 % 13 % 5;   // -> (99 % 13) % 5
    System.out.println("�ܼ� i �{�b�����e�G" + i);
  }
}
