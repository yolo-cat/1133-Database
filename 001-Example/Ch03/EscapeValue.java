public class EscapeValue {
  public static void main(String[] argv) {
    char  ch = '\u5b57'; // 16 �i�� 5b57 �O '�r' �� Unicode �s�X
    System.out.println("�ܼ� ch �����e���G" + ch);
    
    ch = '\\';     // �ϱ׽u \
    System.out.println("�ܼ� ch �����e���G" + ch);
    
    ch = '\'';     // �޸� '
    System.out.println("�ܼ� ch �����e���G" + ch);
  }
}
