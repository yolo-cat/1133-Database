import java.io.Console;

public class ConsoleRW {    
  public static void main(String[] args) {
    Console c = System.console();
      
    String acc = c.readLine("�п�J�b���G");
    char[] pwd = c.readPassword("�п�J�K�X�G");
    c.printf("���z���b�K�� %s, %c%c...\n", acc, pwd[0], pwd[1]);
      
    for(int i=0; i < pwd.length; i++) // �M���K�X�}�C
      pwd[i] = 0;
      
    // �i���L�ާ@
  } 
}
